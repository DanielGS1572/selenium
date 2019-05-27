package Alpha;

import org.apache.logging.log4j.*;


public class DemoAlpha {
	private static Logger log = LogManager.getLogger(DemoAlpha.class.getName());
	public static void main(String[] args) {
		log.debug("I am debugging");		//Cuando se hace una acción como por ejemplo
//sendkeys, click, getText()
		log.info("Info log");				//Para cuando una operación haya terminado 
//correctamente, por ejemplo despues de que termine de cargar una pagina
		log.error("object is not present");	//Cuando falle alguna validación
		log.fatal("this is fatal");
	/*Si se ejecuta lo anterior solo mostrará error y fatal, si se quisiera 
	 * mostrar los mensajes de debug e info se debe tener un archivo de configuración
	 * (Utiliza la configuración defautl) 
	 * 
	 * Al tener la carpeta de Resources hace que cuando ejecute los logs se revise 
	 * la configuración en el archivo xml creado
	 * */	
	
	/* Existen principalmente dos tags:
	 * 		- Appenders y loggers
	 * Where to log? Se usa la etiqueta de appenders
	 * What To log? Se usa la etiqueta de Loggers (aqui se vincula con appenders)...
	 * 				Se le indica el nivel con la etiqueta Root ("error","trace")
	 * How To Log? En la etiqueta de Appenders se le dice un formato (PatternLayout)
	 * 
	 * El xml se debe agregar al build path en la pestaña de source folder y debe estar 
	 * al nivel del proyecto ("Log4jTutorial") [De lo contrario diría 
	 * "Cannot nest 'Log4jTutorial/src/Reso...esources/' from 'Log4jTutorial/src'"
	 * 
	 */
	}

}
