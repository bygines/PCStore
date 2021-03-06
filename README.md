Desarrollo de una aplicación web simple con JavaServer Faces

PCStore

Requerimientos ✅

internacionalización: aplicación (al menos) bilingüe, con el idioma seleccionable desde un desplegable habilitado únicamente en la primera vista 
(mediante un gestor de eventos de tipo changeValueListener, que realice el cambio de contexto adecuado sobre la variable LOCALE). 
Como el cambio de idioma se tiene que mantener durante toda la sesión, la variable LOCALE deberá estar modelada en un javabean de sesión

vista de bienvenida: en la que, además de poder seleccionar el idioma, el usuario se deberá autenticar a partir de la dupla usuario/contaseña (se propone la utilización del 
componente inputSecret de la librería de etiquetas HTML). El par usuario/contraseña se debe enviar una sola vez al servidor, donde se realizarán las comprobaciones 
correspondientes (javabean con ámbito de petición)

vista de selección de la parte a configurar: donde se propone mostrar un desplegable de tipo selectOneMenu con, al menos, las opciones de configuración del procesador (CPU), 
memoria principal (RAM) y el Disco duro (HDD). Dependiendo del valor seleccionado en el desplegable se accederá a la vista de configuración correspondiente

vistas de configuración de los valores propuestos en el desplegable de la vista anterior. Cada vista de producto deberá incluir la información necesaria para que quede 
correctamente descrito y configurado. Una vez especificada la configuración en cada vista concreta, el usuario deberá volver a la vista de selección para continuar con la 
configuración del resto del sistema

vista de facturación, donde se accederá una vez configurado todo el sistema (todas las vistas). Deberá incluir la información de facturación y el método de pago. Asimismo, 
en esta vista se deberán realizar las correspondientes conversiones y validaciones de los datos (como, por ejemplo, la moneda)
vista final de validación de la compra, donde se muestre un resumen de la configuración realizada así como de los datos de facturación

control de errores, de todos los datos del tráfico entre cliente y servidor así como del funcionamiento global de la aplicación. Por ejemplo se debe validar que se han 
configurado todos los elementos del sistema, antes de poder crear la factura

Previsión de problemas ✅

vista de bienvenida: hay que tener en cuenta que cualquier cambio en el desplegable de paises para la internacionalización del sistema supondrá un reenvío automático del 
formulario (nuevo evento) por lo que generará error si no están correctamente informados los campos de usuario y contraseña

vistas de configuración: asegurar la correcta presentación de los distintos componentes (puede que no se rendericen correctamente si no están incluídos en un formulario)
internacionalización (disponibilidad de multilenguaje) comprobar cuándo y dónde se debe actualizar la variable LOCALE ya que, durante el proceso de navegación entre vistas 
y cuando se generan eventos de cambio de valor o de acción, la aplicación toma la variable LOCALE del sistema que es, por defecto, español (por lo que se resetea cualquier 
configuración de idioma que hayamos hecho localmente en nuestra aplicación)

vista de facturación: si damos soporte de idioma sólo a paises de la UE que utilicen el euro como moneda no habrá problema pero si, por ejemplo, internacionalizamos la 
aplicación en inglés para su explotación en EEUU, lo suyo sería que en la pantalla de facturación, el importe se calcule y aparezca en dólares

Propuestas de mejora ✅

vista de bienvenida: gestión del ‘foco’ de la vista entre sus distintos elementos para permitir o no su habilitación dependiendo de la información suministrada 
(no se habilita el botón de login sin antes haber introducido un usuario-pwd)

vista de selección: sustituir el desplegable por una colección de imágenes (tipo tienda de e-commerce) que se activen con los convenientes eventos de acción. 
La disposición de las imágenes en la página puede realizarse a partir de una tabla

vistas de configuración: repasar programación en HTML para la inclusión de los componentes en un formulario donde éstos se renderizen correctamente

navegación: mediante métodos de acción en un managed bean dedicado, separando de esta forma la parte del modelo de la del control (desacople de funcionalidades)
opción de hacer un logout desde cualquier vista

vista de resumen de compra: posibilidad de imprimir el resumen den formato pdf

componentes: utilización del framework de PrimeFaces o de Bootstrap para el desarrollo de las vistas

Bibliografia
