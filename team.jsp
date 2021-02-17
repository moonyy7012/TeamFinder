<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<!--
	Industrious by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
-->
<html>
	<head>
		<title>구해줘 팀즈</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<link rel="stylesheet" href="/teamfinder/css/main.css" />
		<link rel="stylesheet" href="/teamfinder/css/team.css" />
	</head>
	<body class="is-preload">

		<!-- Header -->
			<header id="header">
				<a class="logo" href="index.html">구해줘 팀즈</a>
				<nav>
					<a href="#menu">Menu</a>
				</nav>
			</header>

		<!-- Nav -->
			<nav id="menu">
				<ul class="links">
					<li><a href="member_edit.html">회원정보 수정</a></li>
					<li><a href="team.html">내 팀 정보</a></li>
					<li><a href="mypost.html">내가 쓴 글</a></li>
					<li><a href="secession.html">회원 탈퇴</a></li>
				</ul>
			</nav>

		<!-- Heading -->
			<div id="heading" >
				<h1>내 팀 정보</h1>	
			</div>


		<!-- Main -->
			<section id="main" class="wrapper">
				<div class="inner">
					<div class="content">
						<input type="text" name="user_index"> <!-- 로그인 정보 세션이 없어 임의로 입력 -->
		<!-- 내가 만든 팀과 내가 지원한 팀 중 팀장이 수락한 팀 표시 -->
						<h2 class="h2_title">나의 팀</h2>
						<br>
						<header>
							<div class="h3_title">
								<h3>팀 이름1</h3>
							</div>
						</header>
						
						<form>
							<table>
								<tr>
									<td>팀원</td>
									<td>ID</td>
									<td>팀원리뷰</td>
								</tr>
								<tr>
									<td></td>
									<td></td>
									<td>
									<button class="review">리뷰 등록</button>
									</td>
								</tr>
							</table>
						</form>
						<hr />
						<h2 class="h2_title">수락 대기</h2>
						<br>
						<header>
							<div class="h3_title">
								<h3>수락 대기 중인 팀</h3>
							</div>
						</header>
						
						<form>
							<table>
								<tr>
									<td>팀</td>
									<td>팀장</td>
									<td>수락 여부</td>
								</tr>
								<tr>
									<td></td>
									<td></td>
									<td>
									<button class="accept">수락</button>
									<button class="decline">거절</button>
									</td>
								</tr>
							</table>
						</form>
						<header>
							<div class="h3_title">
								<h3>수락 대기 중인 팀원</h3>
							</div>
						</header>
						
						<form>
							<table>
								<tr>
									<td>팀</td>
									<td>팀원</td>									
									<td>수락 여부</td>
								</tr>
								<tr>
									<td></td>
									<td></td>
									<td>
									<button class="accept">수락</button>
									<button class="decline">거절</button>
									</td>
								</tr>
							</table>
						</form>
						<hr />
					</div>
				</div>
			</section>

		<!-- Footer -->
			<footer id="footer">
				<div class="inner">
					<div class="content">
						<section>
							<h3>Accumsan montes viverra</h3>
							<p>Nunc lacinia ante nunc ac lobortis. Interdum adipiscing gravida odio porttitor sem non mi integer non faucibus ornare mi ut ante amet placerat aliquet. Volutpat eu sed ante lacinia sapien lorem accumsan varius montes viverra nibh in adipiscing. Lorem ipsum dolor vestibulum ante ipsum primis in faucibus vestibulum. Blandit adipiscing eu felis iaculis volutpat ac adipiscing sed feugiat eu faucibus. Integer ac sed amet praesent. Nunc lacinia ante nunc ac gravida.</p>
						</section>
						<section>
							<h4>Sem turpis amet semper</h4>
							<ul class="alt">
								<li><a href="#">Dolor pulvinar sed etiam.</a></li>
								<li><a href="#">Etiam vel lorem sed amet.</a></li>
								<li><a href="#">Felis enim feugiat viverra.</a></li>
								<li><a href="#">Dolor pulvinar magna etiam.</a></li>
							</ul>
						</section>
						<section>
							<h4>Magna sed ipsum</h4>
							<ul class="plain">
								<li><a href="#"><i class="icon fa-twitter">&nbsp;</i>Twitter</a></li>
								<li><a href="#"><i class="icon fa-facebook">&nbsp;</i>Facebook</a></li>
								<li><a href="#"><i class="icon fa-instagram">&nbsp;</i>Instagram</a></li>
								<li><a href="#"><i class="icon fa-github">&nbsp;</i>Github</a></li>
							</ul>
						</section>
					</div>
					<div class="copyright">
						&copy; Untitled. Photos <a href="https://unsplash.co">Unsplash</a>, Video <a href="https://coverr.co">Coverr</a>.
					</div>
				</div>
			</footer>

		<!-- Scripts -->
			<script src="/teamfinder/js/jquery.min.js"></script>
			<script src="/teamfinder/js/browser.min.js"></script>
			<script src="/teamfinder/js/breakpoints.min.js"></script>
			<script src="/teamfinder/js/util.js"></script>
			<script src="/teamfinder/js/main.js"></script>

	</body>
</html>