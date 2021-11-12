<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="sucursal" class="Controllers.SucursalController" scope="page"></jsp:useBean>
<jsp:useBean id="proveedor" class="Controllers.ProveedorController" scope="page"></jsp:useBean>
<!DOCTYPE html>

<html>
    <head>
        <title>Easy</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900" rel="stylesheet">

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="cssLogin/style.css">
        <link rel="shortcut icon" href="images/EasyLog.png"/>
        
    </head>
    <body>

        <div class="wrapper d-flex align-items-stretch">
            <nav id="sidebar" class="" style="background-color: #0d1650;">
                <h1><a href="index.html" class="logo"><img src="img/encode.png" style="height: 80px; width: 200px;" alt=""></a></h1>
                <ul class="list-unstyled components mb-5">
                    <div class="accordion"  id="accordionExample">
                        <div class="card" style="background-color: #0d1650;">
                            <div class="card-header" id="headingCero" >
                                <h2 class="mb-0">
                                    <a href="home.jsp" class="collapsed" style="font-size: large; color: white;"><span class="fa fa-home pl-0"></span> Home</a>
                                </h2>
                            </div>
                        </div>
                        <div class="card" style="background-color: #0d1650;" id="divUsuario">
                            <div class="card-header" id="headingOne" >
                                <h2 class="mb-0">
                                    <a href="#" class="collapsed" style="font-size: large; color: white;" data-toggle="collapse" data-target="#collapseOne" aria-expanded="false" aria-controls="collapseOne"><span class="fa fa-user"></span> Sucursales</a>
                                </h2>
                            </div>

                            <div id="collapseOne" class="collapse" aria-labelledby="headingOne" data-parent="#accordionExample">
                                <div class="card-body" style="background-color: #1b1f96;">
                                    <c:if test="${sessionScope.autenticado}">
                                    <div class="mb-3">
                                        <a href="registroSucursal.jsp" style="color: white;font-size: 16px;"><span class="fa fa-user"></span> Registro Sucursal</a>
                                    </div>
                                    </c:if>
                                    <div>
                                        <a href="ListadoSucursal" style="color: white;font-size: 16px;"><span class="fa fa-list-ul"></span> Listado Sucursales</a>
                                    </div>


                                </div>
                            </div>
                        </div>
                        <c:if test="${sessionScope.autenticado}">
                        <div class="card" style="background-color: #0d1650;">
                            <div class="card-header" id="headingTwo">
                                <h2 class="mb-0">
                                    <a href="#" class="collapsed" style="font-size: large; color: white;" data-toggle="collapse" data-target="#collapseTwo"><span class="fa fa-cc-amex"></span> Empleados</a>
                                </h2>
                            </div>
                            <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionExample">
                                <div class="card-body" style="background-color: #1b1f96;">
                                    <div class="mb-3" id="divRegistroCliente">
                                        <a href="registroEmpleado.jsp" style="color: white;font-size: 16px;"><span class="fa fa-user"></span> Registro Empleado</a>
                                    </div>
                                    <div id="divListadoCliente">
                                        <a href="ListadoEmpleados" style="color: white;font-size: 16px;"><span class="fa fa-list-ul"></span> Listado Empleados</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        </c:if>
                        <div class="card" style="background-color: #0d1650;">
                            <div class="card-header" id="headingThree">
                                <h2 class="mb-0">
                                    <a href="#" class="collapsed" style="font-size: large; color: white;" data-toggle="collapse" data-target="#collapseThree"><span class="fa fa-shopping-cart"></span> Suministros</a>
                                </h2>
                            </div>
                            <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordionExample">
                                <div class="card-body" style="background-color: #1b1f96;">
                                    <c:if test="${sessionScope.autenticado}">
                                    <div class="mb-3" id="divRegistroProducto">
                                        <a href="registroSuministro.jsp" style="color: white;font-size: 16px;"><span class="fa fa-tags"></span> Registro Suministro</a>
                                    </div>
                                    </c:if>
                                    <div class="mb-3" id="divListadoProducto">
                                        <a href="listadoSuministro.jsp" style="color: white;font-size: 16px;"><span class="fa fa-list-ul"></span> Listado Suministros</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <c:if test="${sessionScope.autenticado}">
                        <div class="card" style="background-color: #0d1650;">
                            <div class="card-header" id="headingThree">
                                <h2 class="mb-0">
                                    <a href="#" class="collapsed" style="font-size: large; color: white;" data-toggle="collapse" data-target="#collapseFive"><span class="fa fa-truck"></span> Distribución</a>
                                </h2>
                            </div>
                            <div id="collapseFive" class="collapse" aria-labelledby="headingThree" data-parent="#accordionExample">
                                <div class="card-body" style="background-color: #1b1f96;">
                                    <div class="mb-3" id="divRegistroProducto">
                                        <a href="generarRemito.jsp" style="color: white;font-size: 16px;"><span class="fa fa-file-text-o"></span> Generar Remito</a>
                                    </div>
                                    
                                    <div class="mb-3" id="divListadoProducto">
                                        <a href="listadoRemito.jsp" style="color: white;font-size: 16px;"><span class="fa fa-list-ul"></span> Listado Remitos</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="card" style="background-color: #0d1650;" id="divReporte">
                            <div class="card-header" id="headingFour">
                                <h2 class="mb-0">
                                    <a href="#" class="collapsed" style="font-size: large; color: white;" data-toggle="collapse" data-target="#collapseFour"><span class="fa fa-bar-chart"></span> Reportes</a>
                                </h2>
                            </div>
                            <div id="collapseFour" class="collapse"  aria-labelledby="headingThree" data-parent="#accordionExample">
                                <div class="card-body" style="background-color: #1b1f96;">
                                    <div class="mb-3">
                                        <a href="reporte1.jsp" style="color: white;font-size: 16px;"><span class="fa fa-line-chart"></span> Reporte 1</a>
                                    </div>
                                    <div>
                                        <a href="reporte2.jsp" style="color: white;font-size: 16px;"><span class="fa fa-pie-chart"></span> Reporte 2</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        </c:if>
                    </div>

                </ul>



            </nav>

            <!-- Page Content  -->
            <div id="content"class="p-md-2">

                <nav class="navbar navbar-expand-lg navbar-light bg-light">
                    <div class="container-fluid">
                        <button class="btn btn-dark d-inline-block d-lg-none ml-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                            <i class="fa fa-bars"></i>
                        </button>
                        
                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="nav navbar-nav ml-auto">
                                <c:if test="${!sessionScope.autenticado}">
                                <li class="nav-item active mt-1" style="color: #0d1650;">
                                    <i class="fa fa-user fa-2x" aria-hidden="true"></i>
                                </li>
                                <li class="nav-item" id="ingreso" >
                                    <a href="index.html" class="nav-link">Ingresar</a>
                                </li>
                                </c:if>
                                <c:if test="${sessionScope.autenticado}">
                                <li class="nav-item active mt-1" style="color: #0d1650;">
                                    <i class="fa fa-user fa-2x" aria-hidden="true"></i>
                                </li>
                                <li class="nav-item" id="ingreso" >
                                    <a href="index.html" class="nav-link"> Bienvenido ${sessionScope.usuario}</a>
                                </li>
                                <li class="nav-item" id="divBienvenido" >
                                    <p id="bienvenido" class="mt-2 ml-2"></p>
                                </li>
                                
                                    <li id="divSalir" class="nav-link active mt-1 ml-2" style="color: #0d1650;">
                                        <i class="fa fa-sign-out fa-2x" aria-hidden="true"></i>
                                    </li>
                                    <li class="nav-item" id="divSalirText" >

                                        <a type="submit" class="nav-link" value="" name="CerrarSesion" href="Logout">Cerrar Sesion</a>

                                    </li>
                                </c:if>
                            </ul>
                        </div>
                    </div>
                </nav>

                <!-- Agregar contenido de la pagina  -->
                <h1>Generar Remito</h1>
                
                <div class="container">
                    <form action="RegistroRemito" method="POST">
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                            <select name="cboSucursal" class="form-control">
                                                <option disabled selected> Seleccione una Sucursal</option>
                                            <c:forEach items= "${sucursal.obtenerSucursales()}" var="p">
                                                <option value="${p.idSucursal}">${p.nombre}</option>
                                                </c:forEach>
                                            </select>
                                    </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                            <select name="cboProveedor" class="form-control">
                                                <option disabled selected> Seleccione un Proveedor</option>
                                            <c:forEach items= "${proveedor.obtenerProveedores()}" var="p">
                                                <option value="${p.idProveedor}">${p.nombre}</option>
                                                </c:forEach>
                                            </select>
                                    </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                    <div class="form-group">
                                            <select name="txtIdEmpleado" class="form-control">
                                                <option disabled selected> Seleccione un Empleado</option>
                                            </select>
                                    </div>
                                </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                            <select name="txtIdTransportista" class="form-control">
                                                <option disabled selected> Seleccione un Transportista</option>
                                            </select>
                                    </div>
                            </div>
                        </div>
                        <div class="row">
<!--                            <div class="col-md-6">
                                <div class="form-group">
                                    <input type="date" class="form-control" name="txtFecha" id="txtFecha" value="" />
                                </div>
                            </div>-->
                        </div>
                        
                        <a href="detalleRemito.jsp" class="btn btn-primary"> Agregar Suministros al Carro</a>
                        <input type="submit" class="btn" value="Registrar"  style="background-color: #b21d19; color: white;"/>


                    </form>
                    
                    <h1>Detalle de Remito </h1><br>
                    <table id="mytable" name="mytable" class="table">
                        <thead>
                            <tr>
                                <th>Codigo Suministro</th>
                                <th>Suministro</th>
                                <th>Cantidad</th>
                                <th>Precio</th>
                                <th>Subtotal</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${sessionScope.lstDetalle}" var="item">
                                <tr>
                                    <td>${item.idSuministro}</td>
                                    <td>${item.suministro}</td>
                                    <td>${item.cantidad}</td>
                                    <td>$${item.precioUnitario}</td>
                                    <td>$${item.cantidad * item.precioUnitario}</td>
                                </tr>
                            </c:forEach>
                        </tbody>

                    </table>
                    
                    
                </div>
                
                
                
                <!-- Fin contenido de la pagina  -->
            </div>
        </div>
        
        
        <script src="js/jquery.min.js"></script>
        <script src="js/popper.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/main.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="js/index.js"></script>
        
        <script>
            $(document).ready(function(){
                $('select[name=cboSucursal]').on('change', function(){
                    $.ajax({
                       type: 'GET',
                       url: 'SucursalServlet',
                       data: 'codigoSucursal='+$('select[name=cboSucursal]').val(),
                       statusCode: {
                           404: function(){
                               alert('Pagina no encontrada');
                           },
                           500: function(){
                               alert('Error de Servidor')
                           }
                       },
                       success: function(datos){
                           $('select[name=txtIdEmpleado] option').remove();
                           let datosServlet = datos.split(":");
                           
                           if (datos === "") {
                               $('select[name=txtIdEmpleado]').append('<option disabled selected>No hay empleados en esta sucursal</option> ');
                            }
                           
                           for (var i = 0; i < datosServlet.length -1; i++) {
                                let codigoEmpleado = datosServlet[i].split("-")[0];
                                let nombreEmpleado = datosServlet[i].split("-")[1];
                                console.log(codigoEmpleado , nombreEmpleado);
                                
                                $('select[name=txtIdEmpleado]').append('<option value = "'+codigoEmpleado+'">'+nombreEmpleado+'</option> ');
                            }
                           
                       }
                    });
                });
                
                
                
                
                $('select[name=cboProveedor]').on('change', function(){
                    $.ajax({
                       type: 'GET',
                       url: 'ProveedorServlet',
                       data: 'codigoProveedor='+$('select[name=cboProveedor]').val(),
                       statusCode: {
                           404: function(){
                               alert('Pagina no encontrada');
                           },
                           500: function(){
                               alert('Error de Servidor')
                           }
                       },
                       success: function(datos){
                           $('select[name=txtIdTransportista] option').remove();
                           let datosServlet = datos.split(":");
                           
                           if (datos === "") {
                               $('select[name=txtIdTransportista]').append('<option disabled selected>No hay transportistas en este Proveedor</option> ');
                            }
                           
                           for (var i = 0; i < datosServlet.length -1; i++) {
                                let codigoEmpleado = datosServlet[i].split("-")[0];
                                let nombreEmpleado = datosServlet[i].split("-")[1];
                                console.log(codigoEmpleado , nombreEmpleado);
                                
                                $('select[name=txtIdTransportista]').append('<option value = "'+codigoEmpleado+'">'+nombreEmpleado+'</option> ');
                            }
                           
                       }
                    });
                });
            });
        </script>
        
    </body>
</html>
