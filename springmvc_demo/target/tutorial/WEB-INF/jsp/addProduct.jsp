<%--
  Created by IntelliJ IDEA.
  User: lixindi
  Date: 2016/12/16
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Products</title>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <a href="<c:url value="/j_spring_security_logout" />" class="btn btndanger btn-mini pull-right">logout</a>
            <div class="pull-right" style="padding-right:50px">
                <a href="?language=en">English</a>|<a href="?language=nl">Dutch</a>
            </div>
            <h1>Products</h1>
            <p>Add products</p>
        </div>
    </div>
</section>
<section class="container">
    <form:form modelAttribute="newProduct" class="form-horizontal" enctype="multipart/form-data">
        <form:errors path="*" cssClass="alert alert-danger" element="div"/>
        <fieldset>
            <legend>Add new product</legend>
            <div class="form-group">
                <label class="control-label col-lg-2 col-lg-2" for="productId">
                    <spring:message code="addProduct.form.productId.label"/> </label>
                <div class="col-lg-10">
                    <form:input id="productId" path="productId" type="text" class="form:input-large"/>
                    <form:errors path="productId" cssClass="text-danger"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="name">Name </label>
                <div class="col-lg-10">
                    <form:input id="name" path="name"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="unitPrice">unitPrice </label>
                <div class="col-lg-10">
                    <form:input id="unitPrice" path="unitPrice"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="description">Description </label>
                <div class="col-lg-10">
                    <form:textarea id="description" path="description" rows="2"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="Manufacturer">Manufacturer </label>
                <div class="col-lg-10">
                    <form:input id="Manufacturer" path="Manufacturer"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="Category">Category </label>
                <div class="col-lg-10">
                    <form:input id="Category" path="Category"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="unitsInStock">Units in stock </label>
                <div class="col-lg-10">
                    <form:input id="unitsInStock" path="unitsInStock"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="unitsInStock">Units in Order </label>
                <div class="col-lg-10">
                    <form:input id="unitsInOrder" path="unitsInOrder"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="productImage">productImage</label>
                <div class="col-lg-10">
                    <form:input id="productImage" path="productImage" type="file" class="form:input-large"/>
                </div>
            </div>

            <div class="form-group">
                <label class="control-label col-lg-2" for="condition">Condition</label>
                <div class="col-lg-10">
                    <form:radiobutton id="condition" path="condition" value="New"/>Old
                    <form:radiobutton path="condition" value="Refurbished"/>Refurbished
                </div>
                <div class="form-group">
                    <div class="col-lg-offset-2 col-lg-10">
                        <input type="submit" id="btnAdd" class="btn btn-primary" value="Add"/>
                    </div>
                </div>
            </div>
        </fieldset>
    </form:form>
</section>
</body>
</html>