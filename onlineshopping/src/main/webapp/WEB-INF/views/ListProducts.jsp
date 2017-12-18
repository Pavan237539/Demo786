<div class="container">

	<div class="row">

		<!-- Would be to display sidebar  -->
		<div class="col-sm-3">

			<%@include file="./shared/sidebar.jsp"%>


		</div>

		<!-- to display the actual products -->

		<div class="col-sm-6">


			<!-- Added breadcrumb component -->
			<div class="row">

				<div class="col-xl-12">
				
					<c:if test="${userclickAllProducts == true }">
				
						<ol class="breadcrumb">
							<li class=breadcrumb-item><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item">All Products</li>
						</ol>
					</c:if>

					<c:if test="${userclickcategoryProducts == true }">
						<ol class="breadcrumb">
							<li class=breadcrumb-item><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item">category</li>
							<li class="breadcrumb-item">${category.name}</li>
						</ol>
					</c:if>


				</div>


			</div>
		</div>


	</div>



</div>