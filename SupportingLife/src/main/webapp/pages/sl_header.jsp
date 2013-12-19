<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- JSTL FMT supports time, number and localisation formats. --%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"
	prefix="fmt"%>
<%-- JSTL Functions allow for String manipulation. --%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html lang="en">
<!-- Include <head> in jspf, including JS Script refs. -->
<%@include file="sl_header.jspf"%>
<body>
	<nav>
		<!-- HTML 5 element: Nav Replaces divs for menus, improving GoogleBot searches -->
		<ul id="menubar">
			<li><a href="#">Generate Reports</a>
				<ul>
					<!-- Dropdown menu -->
					
					<li><a href="#">Pre-defined Report</a></li>
					<c:forEach var="preDefinedReport" items="${preDefinedReports}">
						<li><a href="#">${preDefinedReport}</a></li>
					</c:forEach>
					<li><a href="#">Custom Report</a></li>
					<c:forEach var="customReport" items="${customReports}">
						<li><a href="#">${customReport}</a></li>
					</c:forEach>
				</ul>
				<div class="clear"></div> <!-- Restores proper scaling when relative positioning is used in UL. -->
			</li>
			<!-- END Produce Reports dropdown menu. -->

			<li><a href="#">Register User</a></li>
			<li><a href="#">Account Settings</a></li>
			<li><a href="#">Training</a></li>
			<li><a href="#">About</a></li>
			<li><a href="#">Log Out</a></li>
		</ul>
		<!-- END menubar -->
		<div class="clear"></div>
		<!-- Restores proper scaling when relative positioning is used in UL. -->
	</nav>

	<div class="content">
		<h1>Welcome to the Supporting LIFE admin website.</h1>
		<p>Please choose an option from the menu, above.</p>
	</div>
	<!-- END content -->
</body>
</html>