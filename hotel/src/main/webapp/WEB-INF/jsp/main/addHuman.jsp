<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript" src="<%=request.getContextPath() %>/My97DatePicker/WdatePicker.js"></script>
</head>
<body>
	<form action="<%=request.getContextPath() %>/addHuman.do" method="post">
		<table>
			<tr>
				<td>姓名：</td>
				<td><input type="text" name="humanName"/></td>
			</tr>
			<tr>
				<td>性别：</td>
				<td><input type="text" name="sex"/></td>
			</tr>
			<tr>
				<td>电话：</td>
				<td><input type="text" name="humanTel"/></td>
			</tr>
			<tr>
				<td>最晚到达时间：</td>
				<td><input type="text" name="humanArrivetime" onclick="WdatePicker();"/></td>
			</tr>
			<tr>
				<td>身份证号：</td>
				<td><input type="text" name="humanIdcard"/></td>
			</tr>
			<tr>
				<td>支付方式：</td>
				<td><input type="text" name="humanMoneytype"/></td>
			</tr>
			<tr>
				<td>入住天数：</td>
				<td><input type="text" name="days"/></td>
			</tr>
			<tr>
				<td colspan=2>
					<input type="submit" value="提交"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>