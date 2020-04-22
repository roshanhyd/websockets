<!DOCTYPE html>
<html lang="en">

<head>


<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Fuze Ginger - Tables</title>
<link href="../vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
	 <link rel="stylesheet" href="https://kendo.cdn.telerik.com/2020.1.406/styles/kendo.default-v2.min.css" />
	  <script src="https://kendo.cdn.telerik.com/2020.1.406/js/jquery.min.js"></script>
	 
	
<style type="text/css">
#details-container {
	padding: 10px;
}
.margin-50{
margin-left:50px;
}
#details-container h2 {
	margin: 0;
}

#name-link {
	color: blue;
	cursor: pointer;
}

#details-container em {
	color: #8c8c8c;
}

#details-container dt {
	margin: 0;
	display: inline;
}
</style>
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="../css/sb-admin-2.min.css" rel="stylesheet">

<!-- Custom styles for this page -->
<link href="../vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://kendo.cdn.telerik.com/2019.3.1023/styles/kendo.default-v2.min.css" />
</head>

<body id="page-top">
	<div id="wrapper">
		<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">
<li>
			<a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
				<span class="sidebar-brand-icon rotate-n-15">
					<i class="fas fa-laugh-wink"></i>
				</span>
				<span class="sidebar-brand-text mx-3">
					FUZE <sup>Ginger</sup>
				</span>
			</a>
<hr class="sidebar-divider my-0">
</li>

			
			<li class="nav-item active"><a class="nav-link"
				href="/"> <i class="fas fa-fw fa-table"></i> <span>Home</span></a>
			<hr class="sidebar-divider d-none d-md-block">
			<!-- Sidebar Toggler (Sidebar) -->
			<span class="text-center d-none d-md-inline">
				<button class="rounded-circle border-0" id="sidebarToggle"></button>
			</span>
			</li>

</ul>
		<!-- End of Sidebar -->

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<!-- Topbar -->
				<nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">
					<button id="sidebarToggleTop"
						class="btn btn-link d-md-none rounded-circle mr-3">
						<i class="fa fa-bars"></i>
					</button>
					<ul class="navbar-nav ml-auto">
						<li class="nav-item dropdown no-arrow d-sm-none"><a
							class="nav-link dropdown-toggle" href="#" id="searchDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <i class="fas fa-search fa-fw"></i>
						</a> <!-- Dropdown - Messages -->
							<div
								class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
								aria-labelledby="searchDropdown">
								<form class="form-inline mr-auto w-100 navbar-search">
									<div class="input-group">
										<input type="text"
											class="form-control bg-light border-0 small"
											placeholder="Search for..." aria-label="Search"
											aria-describedby="basic-addon2">
										<div class="input-group-append">
											<button class="btn btn-primary" type="button">
												<i class="fas fa-search fa-sm"></i>
											</button>
										</div>
									</div>
								</form>
							</div></li>


						<!-- <div class="topbar-divider d-none d-sm-block"></div> -->
                       	<li class="nav-item dropdown no-arrow">
                       	<a class="nav-link dropdown-toggle" href="#" id="userDropdown"
							role="button" data-toggle="dropdown" aria-haspopup="true"
							aria-expanded="false"> <span
								class="mr-2 d-none d-lg-inline text-gray-600 small" id="currentEmployee">Roshan Sigh</span> <img
								class="img-profile rounded-circle"
								src="https://upload.wikimedia.org/wikipedia/commons/8/89/Portrait_Placeholder.png">
						</a>
							<span class="dropdown-menu dropdown-menu-right shadow animated--grow-in"  aria-labelledby="userDropdown">
								<a class="dropdown-item" href="#"> <i
									class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i> Profile
								</a> <a class="dropdown-item" href="#"> <i
									class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i>
									Settings
								</a> <a class="dropdown-item" href="#"> <i
									class="fas fa-list fa-sm fa-fw mr-2 text-gray-400"></i>
									Activity Log
								</a>
								<span class="dropdown-divider"></span>
								<a class="dropdown-item" href="#" data-toggle="modal"
									data-target="#logoutModal"> <i
									class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
									Logout
								</a>
							</span>
							</li>
							</ul>
				</nav>

				<!-- End of Topbar -->

				<!-- Begin Page Content -->
				<div class="container-fluid">

					<!-- Page Heading -->
					<!-- <h1 class="h3 mb-2 text-gray-800">Tables</h1>
          <p class="mb-4">DataTables is a third party plugin that is used to generate the demo table below. For more information about DataTables, please visit the <a target="_blank" href="https://datatables.net">official DataTables documentation</a>.</p> -->

					<!-- DataTales Example -->
					<div class="card shadow mb-4">
						<div class="card-header py-3">
							<h6 class="m-0 font-weight-bold text-primary">Purchase Order</h6>
							<!-- <button class="btn btn-sm btn-primary margin-50" onclick="socketConnection()" >Connect</button> -->
						</div>
						<div class="card-body">
							<div class="table-responsive">
								<div id="example">
									<!-- <div id="dialog"></div> -->
									<div id="grid"></div>
									<!-- <div id="details"></div> -->
									<span id="notification"></span>



						
								</div>



							</div>
						</div>
					</div>

				</div>
				</div>
				</div>
				<!-- /.container-fluid -->

			</div>
			<!-- End of Main Content -->

		

		
		<!-- End of Content Wrapper -->
<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "Logout" below if you are ready
					to end your current session.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary" href="../login">Logout</a>
				</div>
			</div>
		</div>
	</div>
<script src="https://kendo.cdn.telerik.com/2020.1.406/js/kendo.all.min.js"></script>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/sockjs-client/1.4.0/sockjs.min.js"></script> 
<script src="https://cdnjs.cloudflare.com/ajax/libs/stomp.js/2.3.3/stomp.js"></script>
	<script src="../vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="../js/sb-admin-2.min.js"></script>
	<script src="../js/custom.js"></script>

	
	

    


</body>

</html>
