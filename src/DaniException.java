/**
 *
 */
//checked
  //public class DaniException extends RuntimeException {
public class DaniException extends Exception {
    @Override
    public String getMessage(){
        return "Nome contem caractere inválido";
    }



}
