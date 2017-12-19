<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp"%>
<!-- Main content -->
<section class="content">
	<div class="row">
		<!-- left column -->
		<div class="col-md-12">
			<!-- general form elements -->
			<div class="box">
				<div class="box-header with-border">
					<h3 class="box-title">REGISTER BOARD</h3>
				</div>
				<form role="form" method="post">
					<div class="box-body">
						<div class="form-group">
							<label for="exampleInputTitle1">BNO</label> <input type="text"
								name="bno" class="form-control" value="${boardVO.bno }"
								readonly="readonly">
						</div>
						
						<div class="form-group">
							<label for="exampleInputWriter1">Title</label> <input type="text"
								name="title" class="form-control" value="${boardVO.writer }">
						</div>
	
						<div class="form-group">
							<label for="exampleInputPassword1">Content</label>
							<textarea class="form-control" name="content"
							 rows="3">${boardVO.content }</textarea>
						</div>
	
						<div class="form-group">
							<label for="exampleInputWriter1">Writer</label> <input type="text"
								name="writer" class="form-control" value="${boardVO.writer }">
						</div>
					</div>
					<!-- /.box-body -->
				</form>
				<div class="box-footer">
					<button type="submit" class="btn btn-primary">Save</button>
					<button type="submit" class="btn btn-warning">Cancel</button>
				</div>
				
				<script>
					var formObj = $("form[role='form']");

					console.log(formObj);
					
					$(".btn-primary").on("click", function(){
						formObj.submit();
					});
					
					$(".btn-warning").on("click", function(){
						self.location = "/board/listAll";	
					})
				</script>
			</div>
		</div>
		<!-- /.col (left) -->
	</div>
	<!-- /.row -->
</section>
<!-- /.content -->
</div>

<%@ include file="../include/footer.jsp"%>