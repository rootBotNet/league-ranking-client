package za.co.span.assessment.fixtures.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.co.span.assessment.StartLeagueRankingClientApplication;
import za.co.span.assessment.fixtures.pojo.LoginModel;

import java.util.Scanner;

@Component
public class OptionController {

    private static Logger LOG = LoggerFactory.getLogger(StartLeagueRankingClientApplication.class);

    private CaptureResultController captureResultController;
    private RankingTableController rankingTableController;

    @Autowired
    public OptionController(CaptureResultController captureResultController, RankingTableController rankingTableController) {
        this.captureResultController = captureResultController;
        this.rankingTableController = rankingTableController;
    }

    public Boolean processOption(LoginModel loginModel) {
        String option = null;

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNext()) {
            option = scanner.nextLine();
        }

        switch (option) {
            case "1":
                captureResultController.captureResults(loginModel);
                break;
            case "2":
                rankingTableController.viewRanking(loginModel);
                break;
            case "3":
                return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
