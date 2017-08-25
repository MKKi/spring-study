<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="../include/header.jsp" %>

	<!-- Main content -->
	<section class="content">
		<div class="row">
		<!-- left column -->
		<div class="col-md-12">
			<!-- general form elements -->
			<div class="box">
				<div class="box-header with-border">
					<h3 class="box-title">SUCCESS PAGE</h3>
				</div>
				<div class="box-body">
					<table class="table table-bordered">
						<tr>
							<th style="width: 10px">BNO</th>
							<th>TITLE</th>
							<th>WRITER</th>
							<th>REGDATE</th>
							<th style="width: 40px">VIEWCNT</th>
						</tr>
						<c:forEach items="${list }" var="boardVO">
							<td>${boardVO.bno }</td>
							<td><a href='/board/read?bno=${boardVO.bno }'>${boardVO.title }</a></td>
							<td>${boardVO.writer }</td>
							<td><fmt:formatDate value="${boardVO.regdate }"
								pattern="yyyy-MM-dd HH:mm" /></td>
							<td><span class="badge bg-red">${boardVO.viewcnt }</span></td>
						</c:forEach>
					</table>
				</div>
				<div class="box-footer">
					FOOTER
				</div>
			</div>
		</div> <!-- /.col (left) -->
		</div> <!-- /.row -->
	</section> <!-- /.content -->
	<script>
		var result = '${msg}';
		if(result == 'success'){
			alert('처리 완료');
		}
	</script>

<%@ include file="../include/footer.jsp" %>