<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Spring-Market</title>
</head>
<body>
<h1>Spring-Market<hr></h1>
<h4>Список всех товаров</h4>
<#list products as product>
    <div>
        <p><b>${product.name}</b> ${product.price} руб. | <a href="/product/${product.id}">Подробнее</a></p>
    </div>
</#list>
<hr>
<h3>Создать новый товар</h3>
<form action="/product/create" method="post">
    <br>Название объявления: <input type="text" name="name"><br>
    <br>Описание объявления: <input type="text" name="description"><br>
    <br>Цена: <input type="number" name="price"><br>
    <br>Город: <input type="text" name="city"><br>
    <br>Имя: <input type="text" name="author"><br>

    <br><input type="submit" value="Добавить товар">

</form>
</body>
</html>