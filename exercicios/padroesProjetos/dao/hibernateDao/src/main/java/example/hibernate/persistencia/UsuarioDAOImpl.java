package example.hibernate.persistencia;

import example.hibernate.model.Usuario;
import java.util.List;

/**
 *
 * @author douglas
 */
public class UsuarioDAOImpl  extends GenericDAOImpl<Usuario> implements UsuarioDAO {
  public Usuario buscaUsuarioPorNomeESenha(String nome, String senha) {
    sessao = HibernateUtil.getSession();
    transacao = sessao.beginTransaction();
    List<Usuario> usuario = sessao.createQuery("from Veiculo where nome = " + nome + " AND senha = " + senha).list();
    transacao.commit();
    sessao.close();
    return usuario.get(0);
  }
}
