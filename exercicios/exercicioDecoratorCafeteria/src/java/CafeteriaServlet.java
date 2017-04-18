import cafeteria.dominio.adicionais.Banda;
import cafeteria.dominio.adicionais.TempoAdicional;
import cafeteria.dominio.adicionais.Cerveja;
import cafeteria.dominio.adicionais.Refrigerante;
import cafeteria.dominio.adicionais.Vinho;
import cafeteria.dominio.adicionais.Flores;
import cafeteria.dominio.adicionais.Dj;
import cafeteria.dominio.adicionais.AguadeCoco;
import cafeteria.dominio.Festa;
import cafeteria.dominio.FestaAdolescente;
import cafeteria.dominio.FestaCrianca;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author douglas
 */
public class CafeteriaServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
            Festa festa = null;
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Festa</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Festa!</h1>");

            String tipo_festa = request.getParameter("tipo_festa");
            if (tipo_festa.equalsIgnoreCase("Crianca")) {
                festa = new FestaCrianca();
            } else if (tipo_festa.equalsIgnoreCase("Adolescente")) {
                festa = new FestaAdolescente();
            }

            if (request.getParameterMap() != null) {
                if (request.getParameterMap().containsKey("Flores")) {
                    festa = new Flores(festa);
                }
                if (request.getParameterMap().containsKey("Cerveja")) {
                    festa = new Cerveja(festa);
                }
                if (request.getParameterMap().containsKey("Vinho")) {
                    festa = new Vinho(festa);                    
                }
                if (request.getParameterMap().containsKey("Refrigerante")) {
                    festa = new Refrigerante(festa);
                }
                if (request.getParameterMap().containsKey("aguadecoco")) {
                    festa = new AguadeCoco(festa);
                }
                if (request.getParameterMap().containsKey("banda")) {
                    festa = new Banda(festa);
                }
                if (request.getParameterMap().containsKey("dj")) {
                    festa = new Dj(festa);
                }
                if (request.getParameterMap().containsKey("tempoadicional")) {
                    festa = new TempoAdicional(festa);
                }
            }

            out.println("Custo Total " + festa.cost());
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Festa Servlet";
    }
}
