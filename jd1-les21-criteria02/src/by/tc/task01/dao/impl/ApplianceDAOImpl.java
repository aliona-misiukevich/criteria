package by.tc.task01.dao.impl;

import java.io.*;
import java.util.Set;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO{

	@Override
	public Appliance find(Criteria criteria) {
		try {
			String path = "resources/appliances_db.txt";
			File sourceFile = new File(path);

			BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
			String line = "";
			while ((line = reader.readLine()) != null) {
				if (line.isBlank()){
					continue;
				}
				String[] parts = line.split(":");
				String type = parts[0].trim();
				line = parts[1];
				if(!type.equalsIgnoreCase(criteria.getGroupSearchName()))
				{
					continue;
				}
				Criteria lineCriteria = new Criteria(criteria.getGroupSearchName());
				parts = line.split(",");
				for(String part : parts) {
					String[] criteriaParts = part.trim().split("=");
					String key = criteriaParts[0];
					String value = criteriaParts[1];
					lineCriteria.add(key, value);
				}

				boolean error = false;
				Set<String> keys = criteria.getCriteria().keySet();
				for(String key : keys) {
					if(!lineCriteria.getCriteria().containsKey(key)){
						error = true;
						break;
					}
					String value = criteria.getCriteria().get(key).toString();
					String lineValue = lineCriteria.getCriteria().get(key).toString();
					if(!value.equalsIgnoreCase(lineValue)){
						error = true;
						break;
					}
				}

				if (error) {
					continue;
				}

				Appliance appliance = null;
				switch (lineCriteria.getGroupSearchName()) {
					case "Oven":
						appliance = new Oven();
						break;
					case "Laptop":
						appliance = new Laptop();
						break;
					case "Refrigerator":
						appliance = new Refrigerator();
						break;
					case "Speakers":
						appliance = new Speakers();
						break;
					case "TabletPC":
						appliance = new TabletPC();
						break;
					case "VacuumCleaner":
						appliance = new VacuumCleaner();
						break;
					default: return null;
				}
				appliance.populateFromCriteria(lineCriteria);
				return appliance;
			}
			return null;
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("no file");
		}
		catch (IOException ex) {
			System.out.println("file error");
		}
		return null;
	}
	


}


//you may add your own new classes