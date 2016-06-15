<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	
	 <script type="text/javascript" src="http://cdn.hcharts.cn/jquery/jquery-1.8.3.min.js"></script> 
	 <script type="text/javascript" src="http://cdn.hcharts.cn/highcharts/highcharts.js"></script> 
	 <script type="text/javascript" src="http://cdn.hcharts.cn/highcharts/exporting.js"></script> 	

	<script type="text/javascript">
	$(function () {
	    $('#container').highcharts({
	        title: {
	            text: '酒店一月份纯收入',
	            x: -20 //center
	        },
	        subtitle: {
	            text: '',
	            x: -20
	        },
	        xAxis: {
	            categories: ['1', '2', '3', '4', '5', '6','7', '8', '9', '10', '11', '12','13','14','15','16','17','18','19','20','21','22','23','24','25','26','27','28','29','30','31']
	        },
	        yAxis: {
	            title: {
	                text: '收入 (￥)'
	            },
	            plotLines: [{
	                value: 0,
	                width: 1,
	                color: '#808080'
	            }]
	        },
	        tooltip: {
	            valueSuffix: ''
	        },
	        legend: {
	            layout: 'vertical',
	            align: 'right',
	            verticalAlign: 'middle',
	            borderWidth: 0
	        },
	        series: [{
	            name: 'Tokyo',
	            data: [10000,20000,15000,30000,40000,25000,20000,30000,50000,19000,34000,25000,18000,22000,33000,90000,12000,50000,60000,90000,19000,30000,40000,34000,44000,80000,70000,60000,50000,30000,25000]
	        }]
	    });
	});

	
	</script>


</head>
<body>
	 <div id="container" style="min-width:700px;height:400px"></div>
</body>
</html>