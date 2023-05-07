<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Spring-Market</title>
</head>
<body>
<h1>Spring-Market<hr></h1>
<h4>Подробная инфомрация о товаре</h4>

<br><b>Название товара: </b>${product.name}<br>
<br><b>Описание товара: </b>${product.description}<br>
<br><b>Цена товара: </b>${product.price}<br>
<br><b>Город: </b>${product.city}<br>
<br><b>Автор: </b>${product.author}<br>

<hr>

<form action="/product/delete/${product.id}" method="post">

    <input type="submit" value="Удалить товар">

</form>
</body>
</html>