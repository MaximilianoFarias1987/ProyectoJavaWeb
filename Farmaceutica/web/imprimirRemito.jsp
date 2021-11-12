<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="rem" class="Controllers.RemitoController" scope="page"></jsp:useBean>
<!DOCTYPE html>

<html>
    <head>
        <title>Easy</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900" rel="stylesheet">
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" />
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="cssLogin/style.css">
        <link rel="shortcut icon" href="images/EasyLog.png"/>
        
        <script src="https://cdnjs.cloudflare.com/ajax/libs/html2pdf.js/0.10.1/html2pdf.bundle.min.js" integrity="sha512-GsLlZN/3F2ErC5ifS5QtgpiJtWd43JWSuIgh7mbzZ8zBps+dvLusV+eNQATqgA/HdeKFVgA5v3S/cIrLF7QnIg==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    </head>
    
    <style type="text/css">
        body{
        margin-top:20px;
        color: #484b51;
        }
        .text-secondary-d1 {
            color: #728299!important;
        }
        .page-header {
            margin: 0 0 1rem;
            padding-bottom: 1rem;
            padding-top: .5rem;
            border-bottom: 1px dotted #e2e2e2;
            display: -ms-flexbox;
            display: flex;
            -ms-flex-pack: justify;
            justify-content: space-between;
            -ms-flex-align: center;
            align-items: center;
        }
        .page-title {
            padding: 0;
            margin: 0;
            font-size: 1.75rem;
            font-weight: 300;
        }
        .brc-default-l1 {
            border-color: #dce9f0!important;
        }

        .ml-n1, .mx-n1 {
            margin-left: -.25rem!important;
        }
        .mr-n1, .mx-n1 {
            margin-right: -.25rem!important;
        }
        .mb-4, .my-4 {
            margin-bottom: 1.5rem!important;
        }

        hr {
            margin-top: 1rem;
            margin-bottom: 1rem;
            border: 0;
            border-top: 1px solid rgba(0,0,0,.1);
        }

        .text-grey-m2 {
            color: #888a8d!important;
        }

        .text-success-m2 {
            color: #86bd68!important;
        }

        .font-bolder, .text-600 {
            font-weight: 600!important;
        }

        .text-110 {
            font-size: 110%!important;
        }
        .text-blue {
            color: #478fcc!important;
        }
        .pb-25, .py-25 {
            padding-bottom: .75rem!important;
        }

        .pt-25, .py-25 {
            padding-top: .75rem!important;
        }
        .bgc-default-tp1 {
            background-color: rgba(121,169,197,.92)!important;
        }
        .bgc-default-l4, .bgc-h-default-l4:hover {
            background-color: #f3f8fa!important;
        }
        .page-header .page-tools {
            -ms-flex-item-align: end;
            align-self: flex-end;
        }

        .btn-light {
            color: #757984;
            background-color: #f5f6f9;
            border-color: #dddfe4;
        }
        .w-2 {
            width: 1rem;
        }

        .text-120 {
            font-size: 120%!important;
        }
        .text-primary-m1 {
            color: #4087d4!important;
        }

        .text-danger-m1 {
            color: #dd4949!important;
        }
        .text-blue-m2 {
            color: #68a3d5!important;
        }
        .text-150 {
            font-size: 150%!important;
        }
        .text-60 {
            font-size: 60%!important;
        }
        .text-grey-m1 {
            color: #7b7d81!important;
        }
        .align-bottom {
            vertical-align: bottom!important;
        }
    </style>
    
    <body>

        <div class="wrapper d-flex align-items-stretch">
            <nav id="sidebar" class="" style="background-color: #0d1650;">
                <h1><a href="index.html" class="logo"><img src="img/encode.png" style="height: 80px; width: 200px;" alt=""></a></h1>
                <ul class="list-unstyled components mb-5">
                    <div class="accordion"  id="accordionExample">
<!--                        <div class="card" style="background-color: #0d1650;">
                            <div class="card-header" id="headingCero" >
                                <h2 class="mb-0">
                                    <a href="home.jsp" class="collapsed" style="font-size: large; color: white;"><span class="fa fa-home pl-0"></span> Home</a>
                                </h2>
                            </div>
                        </div>-->
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
                
            <c:forEach items= "${rem.ultimoRemito()}" var="remito">
                <c:set  var="codigo" value="${remito.codigo}"/>
                <c:set  var="sucursal" value="${remito.nomSucursal}"/>
                <c:set  var="codigo" value="${remito.codigo}"/>
                <c:set  var="provincia" value="${remito.provincia}"/>
                <c:set  var="telefono" value="${remito.telefono}"/>
                <c:set  var="fecha" value="${remito.fecha}"/>
                
            </c:forEach>
            

                <div class="page-content container">
                    <div class="page-header text-blue-d2">
                        <h1 class="page-title text-secondary-d1">
                            Remito
                            <small class="page-info">
                                <i class="fa fa-angle-double-right text-80"></i>
                                ID: #0000${codigo}
                            </small>
                        </h1>

                        <div class="page-tools">
                            <div class="action-buttons">
                                <a id="btnCrearPdf" class="btn bg-white btn-light mx-1px text-95" href="#" data-title="PDF">
                                    <i class="mr-1 fa fa-file-pdf-o text-danger-m1 text-120 w-2"></i>
                                    Exportar
                                </a>
                            </div>
                        </div>
                    </div>

                    <div class="container px-0" id="pdf">
                        <div class="row mt-4">
                            <div class="col-12 col-lg-10 offset-lg-1">
<!--                                <div class="row">
                                    <div class="col-12">
                                        <div class="text-center text-150">
                                            <i class="fa fa-book fa-2x text-success-m2 mr-1"></i>
                                            <span class="text-default-d3">Bootdey.com</span>
                                        </div>
                                    </div>
                                </div>-->
                                <!-- .row -->

                                <hr class="row brc-default-l1 mx-n1 mb-4" />

                                <div class="row">
                                    <div class="col-sm-6">
                                        <div>
                                            <span class="text-sm text-grey-m2 align-middle">Para:</span>
                                            <span class="text-600 text-110 text-blue align-middle">${sucursal}</span>
                                        </div>
                                        <div class="text-grey-m2">
                                            
                                            <div class="my-1">
                                                ${provincia}, Argentina
                                            </div>
                                            <div class="my-1"><i class="fa fa-phone fa-flip-horizontal text-secondary"></i> <b class="text-600">${telefono}</b></div>
                                        </div>
                                    </div>
                                    <!-- /.col -->

                                    <div class="text-95 col-sm-6 align-self-start d-sm-flex justify-content-end">
                                        <hr class="d-sm-none" />
                                        <div class="text-grey-m2">
                                            <div class="mt-1 mb-2 text-secondary-m1 text-600 text-125">
                                                Remito
                                            </div>

                                            <div class="my-2"><i class="fa fa-circle text-blue-m2 text-xs mr-1"></i> <span class="text-600 text-90">Código:</span> #0000${codigo}</div>

                                            <div class="my-2"><i class="fa fa-circle text-blue-m2 text-xs mr-1"></i> <span class="text-600 text-90">Fecha de emisión:</span> ${fecha}</div>

                                            
                                        </div>
                                    </div>
                                    <!-- /.col -->
                                </div>

                                <div class="mt-4">
                                    
                        
                                    
                                    <div class="row border-b-2 brc-default-l2"></div>

                                    <!-- or use a table instead -->
                                    
                            <div class="table-responsive">
                                <table class="table table-striped table-borderless border-0 border-b-2 brc-default-l1">
                                    <thead class="bg-none bgc-default-tp1">
                                        <tr class="text-white">
                                            <th class="opacity-2">#</th>
                                            <th>Description</th>
                                            <th>Cantidad</th>
                                            <th>Precio Unitario</th>
                                            <th width="140">Monto</th>
                                        </tr>
                                    </thead>
                
                                    <tbody class="text-95 text-secondary-d3">
                                        
                                    
                                    <c:forEach items= "${rem.ultimoRemito()}" var="p">
                                        <tr>
                                            <td>${p.idSuministro}</td>
                                            <td>${p.nomSuministro}</td>
                                            <td>${p.cantidad}</td>
                                            <td class="text-95">$${p.preUnitario}</td>
                                            <td class="text-secondary-d2">$${p.subTotal}</td>
                                        </tr>
                                        
                                        <c:set  var="total" value="${p.total}"/>
                                        
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                                    

                                    <div class="row mt-3">
                                        <div class="col-12 col-sm-7 text-grey-d2 text-95 mt-2 mt-lg-0">
                                            Nota adicional como información de la empresa o de pago ...
                                        </div>

                                        <div class="col-12 col-sm-5 text-grey text-90 order-first order-sm-last">
<!--                                            <div class="row my-2">
                                                <div class="col-7 text-right">
                                                    SubTotal
                                                </div>
                                                <div class="col-5">
                                                    <span class="text-120 text-secondary-d1">$${total}</span>
                                                </div>
                                            </div>-->

<!--                                            <div class="row my-2">
                                                <div class="col-7 text-right">
                                                    Tax (10%)
                                                </div>
                                                <div class="col-5">
                                                    <span class="text-110 text-secondary-d1">$225</span>
                                                </div>
                                            </div>-->

                                            <div class="row my-2 align-items-center bgc-primary-l3 p-2">
                                                <div class="col-7 text-right">
                                                    Total
                                                </div>
                                                <div class="col-5">
                                                    <span class="text-150 text-success-d3 opacity-2">$${total}</span>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <hr />

                                    <div>
                                        <span class="text-secondary-d1 text-105">Gracias por hacer negocios</span>
<!--                                        <a href="#" class="btn btn-info btn-bold px-4 float-right mt-3 mt-lg-0">Pay Now</a>-->
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Fin contenido de la pagina  -->
            </div>
        </div>

        <script src="js/jquery.min.js"></script>
        <script src="js/popper.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/main.js"></script>
        <script src="js/index.js"></script>
        
        <script>
      document.addEventListener("DOMContentLoaded", () => {
      // Escuchamos el click del botón
      const $boton = document.querySelector("#btnCrearPdf");
      $boton.addEventListener("click", () => {
        const $elementoParaConvertir = document.getElementById('pdf'); // <-- Aquí puedes elegir cualquier elemento del DOM
        html2pdf()
            .set({
                margin: 1,
                filename: 'documento.pdf',
                image: {
                    type: 'jpeg',
                    quality: 0.98
                },
                html2canvas: {
                    scale: 3, // A mayor escala, mejores gráficos, pero más peso
                    letterRendering: true,
                },
                jsPDF: {
                    unit: "in",
                    format: "a3",
                    orientation: 'landscape' // landscape o portrait
                }
            })
            .from($elementoParaConvertir)
            .save()
            .catch(err => console.log(err));
    });
    });
    </script>
        
        
        
    </body>
</html>