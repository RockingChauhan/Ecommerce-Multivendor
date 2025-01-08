package com.features.service;

import com.features.model.Home;
import com.features.model.HomeCategory;

import java.util.List;

public interface HomeService {

    Home creatHomePageData(List<HomeCategory> categories);

}
