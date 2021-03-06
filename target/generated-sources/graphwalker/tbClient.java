// Generated by GraphWalker (http://www.graphwalker.org)
import org.graphwalker.java.annotation.Model;
import org.graphwalker.java.annotation.Vertex;
import org.graphwalker.java.annotation.Edge;

@Model(file = "tbClient.json")
public interface tbClient {

    @Edge()
    void e_backToFrsFromImg();

    @Edge()
    void e_changeSortTypePb();

    @Edge()
    void e_clickPublishBtn();

    @Vertex()
    void v_thePublisher();

    @Edge()
    void e_enterFrsPage();

    @Edge()
    void e_backToMainPage();

    @Edge()
    void e_showAllReply();

    @Edge()
    void e_pbClickMore();

    @Vertex()
    void v_frsMore();

    @Vertex()
    void v_decorChoose();

    @Edge()
    void e_uninterestBtnClick();

    @Edge()
    void e_backToFrsPage();

    @Edge()
    void e_backToPbPage();

    @Vertex()
    void v_frsPage();

    @Edge()
    void e_enterImgPage();

    @Edge()
    void e_changeToOtherTab();

    @Edge()
    void e_clickCancelPb();

    @Vertex()
    void v_showOwnerReply();

    @Edge()
    void e_frsClickShare();

    @Vertex()
    void v_NewVertex();

    @Edge()
    void e_reFresh();

    @Edge()
    void e_clickCancelFrs();

    @Edge()
    void e_goToPbPage();

    @Vertex()
    void v_pbPage();

    @Vertex()
    void v_personalizedMainPage();

    @Edge()
    void e_backToMainFromImg();

    @Vertex()
    void v_pbMore();

    @Vertex()
    void v_imgPage();

    @Edge()
    void e_frsCancelShare();

    @Edge()
    void e_clickDecor();

    @Vertex()
    void v_frsPageShare();

    @Edge()
    void e_closeThePublisher();

    @Edge()
    void e_frsClickMore();

    @Edge()
    void e_onlyTheOwner();

    @Edge()
    void e_goToFrsPage();

    @Vertex()
    void v_otherTab();

    @Edge()
    void e_NewEdge();
}
