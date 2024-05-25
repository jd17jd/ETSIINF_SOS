package tests;

import es.upm.etsiinf.sos.*;
import es.upm.etsiinf.sos.AddUserResponse;
import es.upm.etsiinf.sos.model.xsd.*;

public class TestServicio {
	
//	public static void main(String[] args) {
//
//        System.out.println("==================================== PRUEBAS TOTALES ====================================");
//
//        System.out.println("=========================== INICIALIZACION WineSocialUPMSkeleton ===========================");
//
//		WineSocialUPMSkeleton servicio = new WineSocialUPMSkeleton(); 
//
//        //El set del admin se hace en el constructor
//        System.out.println("El admin tiene\n"
//        + "\t\tUsuario:     '" + servicio.getUserAdmin().getName() + "'\n"
//        + "\t\tContraseña:  '" + servicio.getUserAdmin().getPwd() + "'\n");
//        
//
//        es.upm.etsiinf.sos.model.xsd.User admin = new User();
//        admin.setName("admin");
//        admin.setPwd("admin");
//        servicio.setUserActual(admin);
//
//        System.out.println("El user actual tiene\n"
//        + "\t\tUsuario:     '" + servicio.getUserActual().getName() + "'\n"
//        + "\t\tContraseña:  '" + servicio.getUserActual().getPwd() + "'\n");
//        
//    
//
//        System.out.println("=========================== PRUEBAS addUser ===========================");
//        
//        // userActual = admin
//
//        // Prueba1: Añadir un usuario
//        es.upm.etsiinf.sos.AddUser addUser = new es.upm.etsiinf.sos.AddUser();
//        es.upm.etsiinf.sos.model.xsd.Username username = new es.upm.etsiinf.sos.model.xsd.Username();
//        username.setUsername("Pepito");
//        addUser.setArgs0(username);
//
//        System.out.println("Usuario a añadir: " + addUser.getArgs0().getUsername());
//        AddUserResponse res = servicio.addUser(addUser);
//        System.out.println("addUser(Pepito): " + res.get_return().getResponse() + "\n");
//
//
//        // Prueba2: Añadir un usuario que ya existe
//        System.out.println("Usuario a añadir: " + addUser.getArgs0().getUsername());
//        AddUserResponse res2 = servicio.addUser(addUser);
//        System.out.println("addUser(Pepito): " + res2.get_return().getResponse() + "\n");
//
//
//        // Prueba3: Añadir un usuario con nombre vacio
//        es.upm.etsiinf.sos.AddUser addUser2 = new es.upm.etsiinf.sos.AddUser();
//        es.upm.etsiinf.sos.model.xsd.Username username2 = new es.upm.etsiinf.sos.model.xsd.Username();
//        username2.setUsername("");
//        addUser2.setArgs0(username2);
//
//        System.out.println("Usuario a añadir: " + addUser2.getArgs0().getUsername());
//        AddUserResponse res3 = servicio.addUser(addUser2);
//        System.out.println("addUser(''): " + res3.get_return().getResponse() + "\n");
//
//
//        // Prueba4: Añadir un usuario con nombre nulo
//        es.upm.etsiinf.sos.AddUser addUser3 = new es.upm.etsiinf.sos.AddUser();
//        es.upm.etsiinf.sos.model.xsd.Username username3 = new es.upm.etsiinf.sos.model.xsd.Username();
//        username3.setUsername(null);
//        addUser3.setArgs0(username3);
//        
//        System.out.println("Usuario a añadir: " + addUser3.getArgs0().getUsername());
//        AddUserResponse res4 = servicio.addUser(addUser3);
//        System.out.println("addUser(null): " + res4.get_return().getResponse());
//
//        System.out.println("=========================== FIN addUser ===========================\n");
//
//
//        System.out.println("=========================== PRUEBAS login ===========================");
//
//        // Prueba1: Iniciar sesión con un usuario que existe
//        es.upm.etsiinf.sos.Login login = new es.upm.etsiinf.sos.Login();
//        es.upm.etsiinf.sos.model.xsd.User user = new es.upm.etsiinf.sos.model.xsd.User();
//        user.setName("Pepito");
//        user.setPwd(servicio.getPwdUser("Pepito"));
//        login.setArgs0(user);
//
//        System.out.println("Usuario a loggear: " + login.getArgs0().getName() + ", con contraseña: " + login.getArgs0().getPwd());
//        es.upm.etsiinf.sos.LoginResponse res5 = servicio.login(login);
//        System.out.println("login(Pepito): " + res5.get_return().getResponse() + "\n");
//
//
//        // Prueba2: Iniciar sesión con un usuario que no existe
//        es.upm.etsiinf.sos.Login login2 = new es.upm.etsiinf.sos.Login();
//        es.upm.etsiinf.sos.model.xsd.User user2 = new es.upm.etsiinf.sos.model.xsd.User();
//        user2.setName("NoExisto");
//        user2.setPwd(servicio.getPwdUser("NoExisto"));
//        login2.setArgs0(user2);
//
//        System.out.println("Usuario a loggear: " + login2.getArgs0().getName() + ", con contraseña: " + login2.getArgs0().getPwd());
//        es.upm.etsiinf.sos.LoginResponse res6 = servicio.login(login2);
//        System.out.println("login(NoExisto): " + res6.get_return().getResponse() + "\n");
//
//
//        // Prueba3: Iniciar sesion con un usuario que ya habia iniciado sesion previamente
//        es.upm.etsiinf.sos.Login login3 = new es.upm.etsiinf.sos.Login();
//        es.upm.etsiinf.sos.model.xsd.User user3 = new es.upm.etsiinf.sos.model.xsd.User();
//        user3.setName("Pepito");
//        user3.setPwd("contraseñaIncorrecta");
//        login3.setArgs0(user3);
//
//        System.out.println("Usuario a loggear: " + login3.getArgs0().getName() + ", con contraseña: " + login3.getArgs0().getPwd());
//        es.upm.etsiinf.sos.LoginResponse res7 = servicio.login(login3);
//        System.out.println("login(Pepito): " + res7.get_return().getResponse() + "\n");
//
//
//        // Prueba4: Iniciar sesión con un usuario que tiene la contraseña incorrecta
//            // Previamente debe estar registrado
//        es.upm.etsiinf.sos.AddUser addUser4 = new es.upm.etsiinf.sos.AddUser();
//        es.upm.etsiinf.sos.model.xsd.Username username4 = new es.upm.etsiinf.sos.model.xsd.Username();
//        username4.setUsername("Juanita");
//        addUser4.setArgs0(username4);
//
//        System.out.println("Usuario a añadir: " + addUser4.getArgs0().getUsername());
//        AddUserResponse res8 = servicio.addUser(addUser4);
//        System.out.println("addUser(Juanita): " + res8.get_return().getResponse() + "\n");
//
//            // Y ahora sí, intentar iniciar sesión con la contraseña incorrecta
//        es.upm.etsiinf.sos.Login login4 = new es.upm.etsiinf.sos.Login();
//        es.upm.etsiinf.sos.model.xsd.User user4 = new es.upm.etsiinf.sos.model.xsd.User();
//        user4.setName("Juanita");
//        user4.setPwd("contraseñaIncorrecta");
//        login4.setArgs0(user4);
//
//        System.out.println("Usuario a loggear: " + login4.getArgs0().getName() + ", con contraseña: " + login4.getArgs0().getPwd());
//        es.upm.etsiinf.sos.LoginResponse res9 = servicio.login(login4);
//        System.out.println("login(Juanita): " + res9.get_return().getResponse() + "\n");
//
//
//        // Prueba5: Iniciar sesión con el usuario admin
//        es.upm.etsiinf.sos.Login login5 = new es.upm.etsiinf.sos.Login();
//        es.upm.etsiinf.sos.model.xsd.User user5 = new es.upm.etsiinf.sos.model.xsd.User();
//        user5.setName("admin");
//        user5.setPwd("admin");
//        login5.setArgs0(user5);
//
//        System.out.println("Usuario a loggear: " + login5.getArgs0().getName() + ", con contraseña: " + login5.getArgs0().getPwd());
//        es.upm.etsiinf.sos.LoginResponse res10 = servicio.login(login5);
//        System.out.println("login(admin): " + res10.get_return().getResponse() + "\n");
//
//        System.out.println("=========================== FIN login ===========================\n");
//
//
//
//        System.out.println("=========================== PRUEBAS logout ===========================");
//
//        es.upm.etsiinf.sos.Logout logout = new es.upm.etsiinf.sos.Logout();
//
//    
//        // Prueba1: Cerrar sesión con un usuario que está loggeado
//        es.upm.etsiinf.sos.model.xsd.User user_Actual2 = new es.upm.etsiinf.sos.model.xsd.User();
//        user_Actual2.setName("Pepito");
//        user_Actual2.setPwd(servicio.getPwdUser("Pepito"));
//        login.setArgs0(user_Actual2);
//        servicio.setUserActual(user_Actual2);
//
//        es.upm.etsiinf.sos.LogoutResponse res11 = servicio.logout(logout);
//        System.out.println("logout(): " + res11.get_return().getResponse() + "\n");
//
//
//        // Prueba2: Cerrar sesión con un usuario que no está loggeado
//        es.upm.etsiinf.sos.model.xsd.User user_Actual3 = new es.upm.etsiinf.sos.model.xsd.User();
//        user_Actual3.setName("Juanita");
//        user_Actual3.setPwd(servicio.getPwdUser("Juanita"));
//        login.setArgs0(user_Actual3);
//        servicio.setUserActual(user_Actual3);
//
//        es.upm.etsiinf.sos.LogoutResponse res12 = servicio.logout(logout);
//        System.out.println("logout(): " + res12.get_return().getResponse() + "\n");
//
//
//        // Prueba3: Cerrar sesión de un user que ya ha cerrado sesion
//        servicio.setUserActual(user_Actual2);
//
//        es.upm.etsiinf.sos.LogoutResponse res13 = servicio.logout(logout);
//        System.out.println("logout(): " + res13.get_return().getResponse() + "\n");
//
//        System.out.println("=========================== FIN logout ===========================\n");
//
//
//        System.out.println("=========================== PRUEBAS RateWine ===========================\n");
//
//        
//        
//        //EN ESTA PRUEBA JUANITO PUNTUA VARIOS VINOS
//        
//        User juanito = new User();
//        juanito.setName("juanitoBanana");
//		servicio.usuarioActual = juanito;
//        
//		User juanitoLogin = new User();
//		juanitoLogin.setName("juanitoBanana"); //esto se lo paso al login y al addUser
//		juanitoLogin.setPwd("contraseñaBicho"); //esta no es la contraseña del usuario
//        Login loginJuanito = new Login();
//        loginJuanito.setArgs0(juanitoLogin);
//        servicio.login(loginJuanito); //juanitoBanana inicia sesion
//		
//        
//        System.out.println("======== PRUEBA rateWine ========");
//        RateWine vinoAPuntuar = new RateWine();
//        WineRated vino = new WineRated();
//        vino.setName("Ribera del Duero");
//        vino.setGrape("Tinto");
//        vino.setYear(1993);
//        vino.setRate(8); //lo puntuo con un 8
//        vinoAPuntuar.setArgs0(vino);
//        
//        RateWineResponse rateWineResponse = servicio.rateWine(vinoAPuntuar);
//        //System.out.println("Respuesta de puntuar un vino: " + rateWineResponse.get_return().getResponse());
//         
//        //System.out.println(servicio.imprimeRatedMap());
//        
//        //pruebo a meter otro
//        RateWine vinoAPuntuar2 = new RateWine();
//        WineRated vino2 = new WineRated();
//        vino2.setName("Yllera");
//        vino2.setGrape("Blanco");
//        vino2.setYear(2020);
//        vino2.setRate(6); //lo puntuo con un 6
//        vinoAPuntuar2.setArgs0(vino2);
//        
//        RateWineResponse rateWineResponse2 = servicio.rateWine(vinoAPuntuar2);
//        //System.out.println("Respuesta de puntuar un vino: " + rateWineResponse2.get_return().getResponse());
//        
//        //System.out.println(servicio.imprimeRatedMap());
//        
//        
//        //pruebo a cambiar puntuacion de uno que ya hay dentro
//        RateWine vinoAPuntuar3 = new RateWine();
//        WineRated vino3 = new WineRated();
//        vino3.setName("Yllera");
//        vino3.setGrape("Blanco");
//        vino3.setYear(2020);
//        vino3.setRate(9); //cambio la puntuacion del Yllera a un 9
//        vinoAPuntuar3.setArgs0(vino3);
//        
//        RateWineResponse rateWineResponse3 = servicio.rateWine(vinoAPuntuar3);
//        //System.out.println("Respuesta de puntuar un vino: " + rateWineResponse3.get_return().getResponse());
//        
//        //System.out.println(servicio.imprimeRatedMap());
//        System.out.println("===========================================\n\n");
//        
//        
//        
//        //AHORA LUCIA PUNTUA UN VINO
//        
//        User usuarioLucia = new User();
//        usuarioLucia.setName("lucia_perez");
//		servicio.usuarioActual = usuarioLucia;
//        
//        User lucia = new User();
//        lucia.setName("lucia_perez"); //esto se lo paso al login y al addUser
//        lucia.setPwd("contraseñaBicho"); //esta no es la contraseña del usuario
//        Login loginLucia = new Login();
//        loginLucia.setArgs0(lucia);
//        servicio.login(loginLucia); //lucia_perez inicia sesion
//        
//        
//        RateWine vinoAPuntuar4 = new RateWine();
//        WineRated vino4 = new WineRated();
//        vino4.setName("Ramon Bilbao");
//        vino4.setGrape("Tinto");
//        vino4.setYear(2002);
//        vino4.setRate(10); //lo puntuo con un 10
//        vinoAPuntuar4.setArgs0(vino4);
//        
//        RateWineResponse rateWineResponse4 = servicio.rateWine(vinoAPuntuar4);
//        //System.out.println("Respuesta de puntuar un vino: " + rateWineResponse4.get_return().getResponse());
//        
//        System.out.println(servicio.imprimeRatedMap());
//       
//        System.out.println("=================================");
//        
//        
//        
//        
//        
//        /*
//        System.out.println("======== PRUEBA getMyRates ========");
//        //en principio ya esta loggeado de antes
//        User pepito = new User();
//		pepito.setName("pepitoPlayer");
//		servicio.usuarioActual = pepito;
//		
//		GetMyRates getMyRates = new GetMyRates();
//		GetMyRatesResponse getMyRatesResponse = servicio.getMyRates(getMyRates);		
//        WinesRatedList listaVinosPuntuados = getMyRatesResponse.get_return();
//        boolean fueBien = listaVinosPuntuados.getResult();
//
//        
//        //System.out.println("Respuesta de getMyRates: " + fueBien);
//        if (fueBien) {
//            String[] nombresVinos = listaVinosPuntuados.getNames();
//            String[] nombresUva = listaVinosPuntuados.getGrapes();
//            int[] años = listaVinosPuntuados.getYears();
//            int[] puntuaciones = listaVinosPuntuados.getRates();
//
//            StringBuilder resultado = new StringBuilder("Resultado de getMyRates de '" + servicio.usuarioActual.getName() + "' = [");
//
//            for (int i = 0; i < nombresVinos.length; i++) {
//                if (i > 0) {
//                    resultado.append(", ");
//                }
//                resultado.append("{Nombre: ").append(nombresVinos[i])
//                        .append(", Uva: ").append(nombresUva[i])
//                        .append(", Año: ").append(años[i])
//                        .append(", Puntuacion: ").append(puntuaciones[i]).append("}");
//            }
//
//            resultado.append("]");
//            System.out.println(resultado.toString());
//        } else {
//            System.out.println("No se pudo obtener la lista de vinos puntuados.");
//        }
//
//        System.out.println("=================================");
//        */
//        
//        
//        
//        
//        /*
//        System.out.println("======== PRUEBA getMyFollowerRates ========");
//        // en principio ya está loggeado de antes
//        User pepitoGet = new User();
//        pepitoGet.setName("pepitoPlayer");
//        servicio.usuarioActual = pepitoGet;
//        
//        // Definimos el follower que vamos a consultar
//        //Si juanito ha puntuado algun vino deberian de aparecer y AL REVES (los ultimos puntuados primero)
//        Username follower1 = new Username();
//        follower1.setUsername("juanitoBanana");
//        
//        GetMyFollowerRates getMyFollowerRates = new GetMyFollowerRates();
//        getMyFollowerRates.setArgs0(follower1);
//        GetMyFollowerRatesResponse getMyFollowerRatesResponse = servicio.getMyFollowerRates(getMyFollowerRates);
//        WinesRatedList listaVinosPuntuados = getMyFollowerRatesResponse.get_return();
//        boolean fueBien = listaVinosPuntuados.getResult();
//        
//        if (fueBien) {
//            String[] nombresVinos = listaVinosPuntuados.getNames();
//            String[] nombresUva = listaVinosPuntuados.getGrapes();
//            int[] años = listaVinosPuntuados.getYears();
//            int[] puntuaciones = listaVinosPuntuados.getRates();
//
//            StringBuilder resultado = new StringBuilder("Resultado de getMyFollowerRates de '" + follower1.getUsername() + "' = [");
//
//            for (int i = 0; i < nombresVinos.length; i++) {
//                if (i > 0) {
//                    resultado.append(", ");
//                }
//                resultado.append("{Nombre: ").append(nombresVinos[i])
//                        .append(", Uva: ").append(nombresUva[i])
//                        .append(", Año: ").append(años[i])
//                        .append(", Puntuacion: ").append(puntuaciones[i]).append("}");
//            }
//
//            resultado.append("]");
//            System.out.println(resultado.toString());
//        } else {
//            System.out.println("No se pudo obtener la lista de vinos puntuados del seguidor.");
//        }
//
//        System.out.println("=================================");
//        */
//        
//        
//        
//	}
}
