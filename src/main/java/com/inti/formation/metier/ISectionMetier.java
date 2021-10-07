package com.inti.formation.metier;

import java.util.List;

 
import com.inti.formation.models.Section;

public interface ISectionMetier {
	public void saveOrUpdate(Section s);

	public Section get(long id);

	public Section getById(long id);

    public List<Section> findAll();

	public void delete(long id);
}
