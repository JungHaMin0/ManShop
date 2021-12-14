<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file="../../include/style_css.jsp" %>
</head>
<body class="home page page-template page-template-template-portfolio page-template-template-portfolio-php">
<div id="page">
	<div class="container">
		<%@ include file="../../include/header.jsp" %>
		
		<!-- #masthead -->
		<div id="content" class="site-content">
			<div id="primary" class="content-area column full">
				<main id="main" class="site-main">
				<div class="grid portfoliogrid haminflex">
					<c:forEach items="${mainlist}" var="mainlist">
						<article class="hentry">
						<header class="entry-header">
						<div class="entry-thumbnail">
							<a href="shopSingle.do?n=${mainlist.pdtNum}"><img src="${mainlist.pdtImg}" style="width: 400px; height: 280px;" /></a>
						</div>
						<h2 class="entry-title"><a href="portfolio-item.html" rel="bookmark">${mainlist.pdtBrand}</a></h2>
						<a class='portfoliotype' href='portfolio-category.html'>${mainlist.pdtName}</a>
						<a class='portfoliotype' href='portfolio-category.html'><b>${mainlist.pdtPrice}원</b></a>
						</header>
						</article>
					</c:forEach>
				</div>
				<!-- .grid -->
				
				<nav class="pagination">
				<span class="page-numbers current">1</span>
				<a class="page-numbers" href="#">2</a>
				<a class="next page-numbers" href="#">Next>></a>
				</nav>
				<br/>
				
				</main>
				<!-- #main -->
			</div>
			<!-- #primary -->
		</div>
		<!-- #content -->
	</div>
	<!-- .container -->
	<footer id="colophon" class="site-footer">
	<div class="container">
		<div class="site-info">
			<h1 style="font-family: 'Herr Von Muellerhoff';color: #ccc;font-weight:300;text-align: center;margin-bottom:0;margin-top:0;line-height:1.4;font-size: 46px;">Moschino</h1>
			Shared by <i class="fa fa-love"></i><a href="https://bootstrapthemes.co">BootstrapThemes</a>

		</div>
	</div>	
	</footer>
	<a href="#top" class="smoothup" title="Back to top"><span class="genericon genericon-collapse"></span></a>
</div>
<%@ include file="../../include/style_js.jsp" %>
</body>