<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="components/common_css_js.jsp"%>
<title>Register page</title>
</head>
<body>
	<%@ include file="components/navbar.jsp"%>
	<div class="container-fluid my-4">
		<div class="row justify-content-center">
			<div class="col-md-5">
				<div class="card border-1 mt-1">
					<div class="card-body">
						<form action="registerServlet1" method="post">
							<h1 class="text-center">Sign Up Here!</h1>
							<div class="mb-3">
								<label for="name" class="form-label fw-bold">Enter
									Username</label> 
									<input type="text" name="user_name" id="name"
									class="form-control" placeholder="Enter your name here">
							</div>
							<div class="mb-3">
								<label for="email" class="form-label fw-bold">Enter
									Email</label> <input type="email" id="email" name="user_email"
									class="form-control" placeholder="Enter your email here">
							</div>
							<div class="mb-3">
								<label for="password" class="form-label fw-bold">Enter
									Password</label> <input type="password" id="password"
									name="user_password" class="form-control"
									placeholder="Enter your password here">
							</div>
							<div class="mb-3">
								<label for="phone_number" class="form-label fw-bold">Enter
									Phonenumber</label> <input type="number" id="phone_number"
									name="user_phonenumber" class="form-control"
									placeholder="Enter your Phone number here">
							</div>
							<div class="mb-3">
								<label for="address" class="form-label fw-bold">Enter
									Address</label>
								<textarea id="address" name="user_address" class="form-control"
									style="height: 70px" placeholder="Enter your address here"></textarea>
							</div>
							<div class="text-center">
								<button type="submit" value="submit"
									class="btn btn-outline-success">Register</button>
								<button type="reset" class="btn btn-outline-primary">Reset</button>
							</div>
							<div class="text-center mt-3">
								<p>or sign up with:</p>
								<button type="button" class="btn btn-link btn-floating mx-1">
									<i class="fa fa-facebook"></i>
								</button>

								<button type="button" class="btn btn-link btn-floating mx-1">
									<i class="fa fa-google"></i>
								</button>

								<button type="button" class="btn btn-link btn-floating mx-1">
									<i class="fa fa-twitter"></i>
								</button>

								<button type="button" class="btn btn-link btn-floating mx-1">
									<i class="fa fa-git"></i>
								</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="components/footer.jsp"%>
</body>
</html>