package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class FuncaoObterIdDoUsuarioLogado {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// FuncaoObterIdDoUsuarioLogado
public static Var obterIdDoUsuarioLogado() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return cronapi.database.Operations.getField(cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u.id, u from User u where u.login = :login"),Var.valueOf("login",cronapi.util.Operations.getCurrentUserName())), Var.valueOf("this[0]"));
   }
 }.call();
}

}

