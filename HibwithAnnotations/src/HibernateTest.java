import org.hibernate.Session;

import com.samples.domain.Message;
import com.samples.Utils.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Message message = new Message("Hello world with Hibernate and annotations2"); 
		
		session.save(message);
		
		session.getTransaction().commit();
		
		session.close();
		
	}
}