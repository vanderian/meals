package sk.vander.meals.data.database.model;

import com.orm.SugarRecord;
import com.orm.dsl.Column;

import sk.vander.meals.data.api.model.AddOn;

/**
 * Created by arashid on 21/06/16.
 */
public class AddOnDao extends SugarRecord {
  @Column(name = "uid", unique = true) String uid;
  String name;
  ServingSizeDao servingSizeDao;
  String catUid;

  public AddOnDao() {
  }

  public AddOnDao(AddOn addOn) {
    uid = addOn.id();
    name = addOn.name();
    servingSizeDao = new ServingSizeDao(addOn.servingSize());
    catUid = addOn.category().id();
  }

  public String getName() {
    return name;
  }

  public String getUid() {
    return uid;
  }

  public ServingSizeDao getServingSizeDao() {
    return servingSizeDao;
  }
}
