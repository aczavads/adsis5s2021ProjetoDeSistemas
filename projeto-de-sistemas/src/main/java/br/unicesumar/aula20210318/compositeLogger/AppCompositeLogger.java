package br.unicesumar.aula20210318.compositeLogger;

public class AppCompositeLogger {

    public static void main(String[] args) {
        AutorController controller = new AutorController();

        //implementar um composite para MyLogger e usar no controller
        //controller.setLogger(<<composite>>);

        System.out.println("Versão do controller: " + controller.getVersion());
    }
    
}
