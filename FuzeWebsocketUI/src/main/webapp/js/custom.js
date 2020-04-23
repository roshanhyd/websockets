var resultData=[];
var readDataList = [];
var socketCurrentData =[];
var socketdata =[];
var socketStatus = false;
var currrentData =[];
var popupNotification = $("#popupNotification").kendoNotification({
	 position: {
        pinned: true,
        top: 30,
        right: 30,
        appendTo: "#appendto"
    }
    }).data("kendoNotification");
var dataSource12 = new kendo.data.DataSource({
    transport: {
      read:  {
      	url: "http://localhost:8088/RePO/getPoRequest",
          dataType: "json",
          cache: false,
      }
    }
  });  

	

$(function(){
/*    function displayLoading(target) {
        var element = $(target);
        kendo.ui.progress(element, true);
        setTimeout(function(){
            kendo.ui.progress(element, false);
        }, 3000);        
    }

    displayLoading(document.body);
*/    
var stompClient = null;
//$('#btn').click(function () {// if you want to do this on any click then enable
    var socket = new SockJS('http://localhost:9191/fuze-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        // setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/project/data', function (greeting) {
             currrentData = JSON.parse(greeting.body);
            socketdata=currrentData;
            console.log(socketdata);
            console.log(currrentData);
                      
           
       	 dataSource12.fetch(function(){
       		var data = dataSource12._pristineData;
          	if(currrentData != ""){
          		
          	
       		  $.each(data, function(index, value) {
       			  $.each(socketdata, function(index1, value1) {
       				 if(data[index].siteProjectsId == socketdata[index1].SITE_PROJECT_ID && data[index].siteInfoId == socketdata[index1].SITE_INFO_ID){
              			 data[index].poName = value1.PO_NAME?value1.PO_NAME :data[index].poName;
              			 data[index].siteName = value1.SITE_NAME?value1.SITE_NAME :data[index].siteName;
              			 data[index].projectName = value1.PROJECT_NAME?value1.PROJECT_NAME :data[index].projectName;	
              			 data[index].poStatus = value1.PO_STATUS?value1.PO_STATUS :data[index].poStatus;
              			 data[index].projectStatus = value1.PROJECT_STATUS?value1.PROJECT_STATUS :data[index].projectStatus;
              			 data[index].pslc = value1.PSLC?value1.PSLC :data[index].pslc;	
              			data[index].siteTracker = value1.SITETRACKER?value1.SITETRACKER: data[index].siteTracker;
              			 }
       			  
              		}) 
       		  console.log(data.length);  // displays "77"
       			  socketCurrentData = data;
       			  console.log(socketCurrentData);
       			 $("#grid").kendoGrid({
						dataSource: {
					      transport: {
					         read: function (e) {
					             //readData(options);
					        	 e.success(socketCurrentData);
					        //  window.location.replace("dashboard");
					             },
					        update: function (options) {
					        updateRow(options);
					      //  window.location.replace("/");
					       
					             },
					        
					             destroy: function (options) {
					            	 deleteRow(options);
					                readData(options);
					            	    
						             },
						        
					             create: function (options) {
						            createRow(options);
						            window.location.replace("/");
						            	  },
					          parameterMap: function (options, operation) {
					        		if (operation !== "read" && options.models) {
					              		return { models: kendo.stringify(options.models) };
					              		}
					            	}
					          },
					        schema: {
					        	 model: {
                                    id: "siteProjectsId",
                                    fields: {
                                   	 siteProjectsId: {type:"string"},
                                   	 siteInfoId: {type:"string"},
                                   	 projectName: {type:"string"},
                                   	 siteName: {type:"string"},
                                   	 pslc: {type:"string"},
                                   	 poName: {type:"string"},
                                   	 teritory: {type:"string"},
                                   	 market: {type:"string"},
                                   	 poStatus: {type:"string"},
                                   	 siteTracker: {type:"string"},
                                   	 projectStatus: {type:"string"},
                                   	 projectType: {type:"string"},
                                   	 customerProjectType: {type:"string"},
                                   	 lastModifiedBy: {type:"string"},
                                   	 
                                   	 
                                    }
                                }
					        },
					         pageSize: 7
					    },
					    pageable: true,
                       sortable: true,
                       filterable: true,
					    resizable:true,
					    	columns: [
					    	{ command: ["edit"], title: "&nbsp;", width: "100px" },
					    	{ field:"siteProjectsId", title:"Site Projects Id", width: "150px",editable: isEditable },
					    	{ field:"siteProjectsId", title:"Site Info Id", width: "120px" ,editable: isEditable},
					    	{ field:"projectName", title:"Project Name", width: "150px" },
					    	{ field:"siteName", title:"Site Name", width: "120px" },
					    	{ field:"pslc", title:"PSLC", width: "120px" },
					    	{ field:"poName", title:"Purchase Order Name", width: "180px" },
					    	//{ field:"teritory", title:"Teritory", width: "120px" },
					    	//{ field:"market" ,title:"Market", width: "120px" },
					    	//{ field:"poStatus", title:"PO Status", width: "120px" },
					    	{ field:"siteTracker", title:"Site Tracker", width: "120px" },
					    	{ field:"projectStatus", title:"Project Status", width: "120px",customBoolEditor }
					    	//{ field:"projectType", title:"Project Type", width: "120px" },
					    	//{ field:"customerProjectType", title:"Customer Project Type", width: "120px" },
					    	//{ field:"lastModifiedBy", title:"Last Modified", width: "120px" ,customBoolEditor },
                            
                            ],
                  editable: "popup"
				});
       		});
           
            
      
    }
    else{
    	copyGrid();
        	
			
}
       	 });
        });
    });
    
            
            
        
        
var wnd,detailsTemplate;
if(currrentData == ""){
	copyGrid();	
}

									
										
									function customBoolEditor(container, options) {
										 var guid = kendo.guid();
					                     $('<input class="k-checkbox" id="' + guid + '" type="checkbox" name="Discontinued" data-type="boolean" data-bind="checked:Discontinued">').appendTo(container);
					                     $('<label class="k-checkbox-label" for="' + guid + '">​</label>').appendTo(container);
					                 }

function readData(){
	$.ajax({
        url: "http://localhost:8088/RePO/getPoRequest",
        dataType: "json",
        cache: false,
        success: function (result) {
        	console.log(result);
        	resultData = result;
        	
        	//$(".k-window-title").empty();
			//$(".k-window-title").append("New");
			//var userList=result.items;
           //options.success(result);
          
        },
        error: function (result) {
        	//options.success(result);
         }
       });

}

function updateRow(options){
	 var sampledata= options.data;
	$.ajax({
			 url:"http://localhost:8088/RePO/createPORequest",
	        contentType: "application/json",
	        type:"POST",
	     contentType : "application/json; charset=utf-8",
	        data:JSON.stringify({
	        	
	        		"siteProjectsId":options.data.siteProjectsId,
	        		"siteInfoId":options.data.siteInfoId,
	        		"projectName":options.data.projectName,
	        		"siteName":options.data.siteName,
	        		"pslc":options.data.pslc,
	        		"poName":options.data.poName,
	        		"teritory":options.data.teritory,
	        		"market":options.data.market,
	        		"poStatus":options.data.poStatus,
	        		"siteTracker":options.data.siteTracker,
	        		"projectStatus":options.data.projectStatus,
	        		"projectType":options.data.projectType,
	        		"customerProjectType":options.data.customerProjectType,
	        		"lastModifiedBy":options.data.lastModifiedBy
	        		
	        	}),
	        success: function (result) {
	        		 options.success(result);
	        		  popupNotification.show("PO Request Updated Successfuly", "info");
	        		// popupNotification.show("PO Request Created Successfuly", "info");
	 	    },
	        error: function (result) {
	        	options.error(result);
	         }
	       });
}


function createRow(options){
	 var sampledata= options.data;
	$.ajax({
			 url:"http://localhost:8088/RePO/createPORequest",
	        contentType: "application/json",
	        type:"POST",
	     contentType : "application/json; charset=utf-8",
	        data:JSON.stringify({
	        	"siteInfoId":options.data.siteInfoId,
        		"projectName":options.data.projectName,
        		"siteName":options.data.siteName,
        		"pslc":options.data.pslc,
        		"poName":options.data.poName,
        		"teritory":options.data.teritory,
        		"market":options.data.market,
        		"poStatus":options.data.poStatus,
        		"siteTracker":options.data.siteTracker,
        		"projectStatus":options.data.projectStatus,
        		"projectType":options.data.projectType,
        		"customerProjectType":options.data.customerProjectType,
        		"lastModifiedBy":options.data.lastModifiedBy,
        		}),
	        success: function (result) {
	        		 options.success(result);
	        		 popupNotification.show("PO Request Created Successfuly", "info");
	 	    },
	        error: function (result) {
	        	options.error(result);
	         }
	       });
}

function deleteRow(options){
	// sampleData.splice(getIndexById(options.data.id), 1);
	$.ajax({
		 url: "http://localhost:8088/RePO/deletePoRequest/"+options.data.siteProjectsId,
       contentType: "application/json",
       type:"GET",
    contentType : "application/json; charset=utf-8",
       success: function (result) {
       		 options.success(result);
       		 popupNotification.show("PO Request Deleted Successfuly", "info");
	    },
       error: function (result) {
       	options.error(result);
        }
      });
}
       




function copyGrid(){
	dataSource12.fetch(function(){
   		var data = dataSource12._pristineData;
   	socketCurrentData = data;
	
	  $("#grid").kendoGrid({
			dataSource: {
		      transport: {
		         read: function (e) {
		             //readData(options);
		        	 e.success(socketCurrentData);
		        //  window.location.replace("dashboard");
		             },
		        update: function (options) {
		        updateRow(options);
		       // window.location.replace("/");
		       
		             },
		        
		             destroy: function (options) {
		            	 deleteRow(options);
		                readData(options);
		            	    
			             },
			        
		             create: function (options) {
			            createRow(options);
			            window.location.replace("/");
			            	  },
		          parameterMap: function (options, operation) {
		        		if (operation !== "read" && options.models) {
		              		return { models: kendo.stringify(options.models) };
		              		}
		            	}
		          },
		        schema: {
		        	 model: {
                     id: "siteProjectsId",
                     fields: {
                    	 siteProjectsId: {type:"string"},
                    	 siteInfoId: {type:"string"},
                    	 projectName: {type:"string"},
                    	 siteName: {type:"string"},
                    	 pslc: {type:"string"},
                    	 poName: {type:"string"},
                    	 teritory: {type:"string"},
                    	 market: {type:"string"},
                    	 poStatus: {type:"string"},
                    	 siteTracker: {type:"string"},
                    	 projectStatus: {type:"string"},
                    	 projectType: {type:"string"},
                    	 customerProjectType: {type:"string"},
                    	 lastModifiedBy: {type:"string"},
                    	 
                    	 
                     }
                 }
		        },
		         pageSize: 7
		    },
		    pageable: true,
        sortable: true,
        filterable: true,
		    resizable:true,
		    	columns: [
		    		{ command: ["edit"], title: "&nbsp;", width: "100px" },
		    		
		    	{ field:"siteProjectsId", title:"Site Projects Id", width: "150px", editable: isEditable},
		    	{ field:"siteProjectsId", title:"Site Info Id", width: "120px" ,editable: isEditable},
		    	{ field:"projectName", title:"Project Name", width: "150px" },
		    	{ field:"siteName", title:"Site Name", width: "120px" },
		    	{ field:"pslc", title:"PSLC", width: "120px" },
		    	{ field:"poName", title:"Purchase Order Name", width: "180px" },
		    	//{ field:"teritory", title:"Teritory", width: "120px" },
		    	//{ field:"market" ,title:"Market", width: "120px" },
		    	//{ field:"poStatus", title:"PO Status", width: "120px" },
		    	{ field:"siteTracker", title:"Site Tracker", width: "120px" },
		    	
		    	//{ field:"projectType", title:"Project Type", width: "120px" },
		    	//{ field:"customerProjectType", title:"Customer Project Type", width: "120px" },
		    	//{ field:"lastModifiedBy", title:"Last Modified", width: "120px" ,customBoolEditor },
		    	{ field:"projectStatus", title:"Project Status", width: "120px",customBoolEditor }
             ],
   editable: "popup"
	});
	});
}

function isEditable(e){
    var dataSource = $("#grid").data("kendoGrid").dataSource;
    // If the id(ProductID) is null, then it is editable.
    return e.siteProjectsId == null;
    return e.siteInfoId== null;
  }

});