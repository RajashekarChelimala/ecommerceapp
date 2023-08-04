<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/components/common_css_js.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
	<%@ include file="components/navbar.jsp" %>
	<div class="container mt-4">
		<div class="row justify-content-center">
			<div class="col-lg-5">
				<form class="border border-primary-2 rounded p-5" action="loginServlet" method="post">
					<!-- Email input -->
					<h1>Login</h1>
					<div class="form-outline mb-4">
						<input type="email" name="useremail" id="form2Example1" class="form-control" /> <label
							class="form-label" for="form2Example1">Email address</label>
					</div>

					<!-- Password input -->
					<div class="form-outline mb-4">
						<input type="password" name="userpassword" id="form2Example2" class="form-control" />
						<label class="form-label" for="form2Example2">Password</label>
					</div>

					<!-- 2 column grid layout for inline styling -->
					<div class="row mb-4">
						<!-- <div class="col d-flex justify-content-center">
							Checkbox
							<div class="form-check">
								<input class="form-check-input" type="checkbox" value=""
									id="form2Example31" checked /> <label class="form-check-label"
									for="form2Example31"> Remember me </label>
							</div>
						</div> -->

						<div class="col">
							<!-- Simple link -->
							<a href="#!">Forgot password?</a>
						</div>
					</div>

					<!-- Submit button -->
					<button type="submit" class="btn btn-primary btn-block mb-4">Sign
						in</button>

					<!-- Register buttons -->
					<div class="text-center">
						<p>
							Not a member? <a href="Register.jsp">Register</a>
						</p>
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
	<%@ include file="components/footer.jsp"%>
	<!-- 
	<div class="container-xxl">
         <div class="row justify-content-center " id="card">
             <div class="col-lg-4">
                <div class="card mt-5 me-5">
                 <%-- <%@ include file="components/message.jsp" %> --%>
                      <div class="card-body py-3">
                          <div class="card-title fw-bold text-center">
                            LOGIN
                          </div>
                          <form action="loginServlet" method="post">
                            <div class="input-group mb-3">
                                <span class="input-group-text bg-white border-0">
                                    <i class="bi bi-person"></i>
                                </span>
                                <input type="email" name="useremail" placeholder="Email Id" class="border-0">
                            </div>
                            <div class="input-group mb-3">
                                <span class="input-group-text bg-white border-0">
                                    <i class="bi bi-key-fill"></i>
                                </span>
                                <input type="password" name="userpassword" placeholder="Password" class="border-0">
                            </div>
                            <div class="fw-bold text-end">
                              <a href="#" class="text-danger">Forgot?</a>
                            </div>
                            <div class="text-center">
                                 <button class="btn btn-danger rounded-pill width:100px" type="submit">Login</button>
                            </div>
                            <div class="text-center mt-4">
                                Did't have an account? <a href="Register.jsp">Register here</a>
                            </div>
                            </form> 
                      </div>
                </div>
                <div class="p-1 me-5 rounded-bottom shadow bg-danger"></div>
             </div>
         </div>
      </div>
	 -->
</body>
</html>