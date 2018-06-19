package xmlproject.repository;

import xmlproject.exception.RepoException;

public interface WineRepository
{

	public void importObjects() throws RepoException;
	
	public void exportObjects() throws RepoException;
	
}
