package com.teamtreehouse.PublicData;

import com.teamtreehouse.PublicData.viewer.CountryViewer;
import com.teamtreehouse.PublicData.controller.CountryController;

public class Application {

    public static void main(String[] args) {

        CountryController controller = new CountryController();
        CountryViewer viewer = new CountryViewer(controller);

        viewer.run();

    }

}