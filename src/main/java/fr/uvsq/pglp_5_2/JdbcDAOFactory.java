package fr.uvsq.pglp_5_2;

public class JdbcDAOFactory extends AbstractDAOFactory {

	@Override
	public DAO<Personnel> getPersonnelDAO() {
		return new PersonnelJdbcDAO();
	}

	@Override
	public DAO<PersonnelGroupe> getPersonnelGroupeDAO() {
		return new PersonnelGroupeJdbcDAO();
	}

}
