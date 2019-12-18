package dao;

import entity.AppCategory;

import java.util.List;

public interface AppCategoryMapper {

    public List<AppCategory> getFirstList();

    public List<AppCategory> getSecondList(String firstId);

    public List<AppCategory> getThirdList(String secondId);


}
