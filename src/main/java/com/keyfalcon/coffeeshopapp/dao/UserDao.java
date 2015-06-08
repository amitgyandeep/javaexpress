package com.keyfalcon.coffeeshopapp.dao;

import java.sql.SQLException;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.keyfalcon.coffeeshopapp.model.User;
public class UserDao extends GenericDaoHibernate<User,Long> implements IUserDao{
	
	public UserDao() {

		super( User.class );

	}

	public User getUserByEmailIdAndPassword( final String emailId, final String password) {
		
		return ( User ) getHibernateTemplate().execute( new HibernateCallback() {

			public Object doInHibernate( Session session ) throws HibernateException, SQLException {

				Criteria criteria = session.createCriteria( User.class );

				criteria.add( Restrictions.eq( "emailId" , emailId ) );
				criteria.add( Restrictions.eq( "password" , password ) );

				criteria.setMaxResults(1);
				return criteria.uniqueResult();

			}
		} );
	}

}
