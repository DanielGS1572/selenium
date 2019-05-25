package seleniummaven;

/**
 * Hello world!
 *
 */
public class App {
	/* Para crear un proyecto maven por linea de comandos sería:
	 * 
	 * mvn archetype:generate -DgroupId=seleniummaven -DartifactId=Mavenjava
	 * -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode= false
	 * 
	 * 			Ver que:
	 * 			-DgroupId es el nombre del paquete
	 * 			-DartifactId es el nombre del proyecto (y es como se identifican en el repositorio de maven)
	 * 			-DarchetypeArtifactId es la arquitectura de un arquetipo básico
	 * 
	 * Después de ejecutar la linea anterior es necesario ejecutar:
	 * 			mvn eclipse:eclipse para que gentere los archivos:
	 * 					- .classpath
	 * 					- .project
	 * 			De esta manera ya se podrían importar en eclipse como un proyecto maven
	 * 
	 * Recordar que todas las dependencias se guardan en .m2/repository
	 * El arquetipo genera una carpeta para pruebas y otra para las clases del proyect
	 * 			
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
