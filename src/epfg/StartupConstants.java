package epfg;

/**
 * This class provides setup constants for initializing the application
 * that are NOT language dependent.
 * 
 * @author Seunghyuk Sean Choi
 */
public class StartupConstants {

    // WE'LL LOAD ALL THE UI AND LANGUAGE PROPERTIES FROM FILES,
    // BUT WE'LL NEED THESE VALUES TO START THE PROCESS

    public static String PROPERTY_TYPES_LIST = "property_types.txt";
    public static String UI_PROPERTIES_FILE_NAME = "properties_EN.xml";
    public static String PROPERTIES_SCHEMA_FILE_NAME = "properties_schema.xsd";
    public static String PATH_DATA = "./data/";
    public static String PATH_EPORTFOLIO = PATH_DATA + "eportfolio/";
    public static String PATH_IMAGES = "./images/";
    public static String PATH_ICONS = PATH_IMAGES + "icons/";
    public static String PATH_EPORTFOLIO_IMAGES = PATH_IMAGES;
    public static String PATH_VIDEOS = "./data/videos/";
    public static String PATH_CSS = "/epfg/style/";
    public static String STYLE_SHEET_UI = PATH_CSS + "ePortfolioGeneratorStyle.css";

    // HERE ARE THE LANGUAGE INDEPENDENT GUI ICONS
    public static String ICON_NEW_EPORTFOLIO = "New.png";
    public static String ICON_LOAD_EPORTFOLIO = "Load.png";
    public static String ICON_SAVE_EPORTFOLIO = "Save.png";
    public static String ICON_SAVE_AS_EPORTFOLIO = "SaveAs.png";
    public static String ICON_VIEW_EPORTFOLIO = "View.png";
    public static String ICON_EXIT = "Exit.png";
    public static String ICON_ADD_PAGE = "Add.png";
    public static String ICON_REMOVE_PAGE = "Remove.png";
    public static String ICON_MOVE_UP = "MoveUp.png";
    public static String ICON_MOVE_DOWN = "MoveDown.png";
    public static String ICON_PREVIOUS = "Previous.png";
    public static String ICON_NEXT = "Next.png";
    public static String ICON_APPLICATION = "application.png";
    public static String ICON_TITLECHANGER ="titlechange.png";
    public static String ICON_SLIDESHOW="SlideShow.png";
    public static String ICON_EXPORT = "export.png";
    public static String ICON_IMAGE = "image.png";
    public static String ICON_VIDEO = "video.png";
    public static String ICON_TEXT = "text.png";
    public static String ICON_REMOVE = "delete.png";
    public static String ICON_CLEAR = "clear.png";
    public static String ICON_REVERT = "revert.png";
    public static String ICON_LAYOUT = "layout.png";
    public static String ICON_FONT = "font.png";
    public static String ICON_STUDENT = "student.png";
    public static String ICON_FOOTER = "footer.png";
    public static String ICON_BANNER = "banner.png";
    public static String ICON_COLOR = "color.png";
    public static String ICON_TRANSITION = "transition.png";
    public static String ICON_LIST = "list.png";
    public static String ICON_DOT = "dot.png";
    public static String ICON_HYPERLINK = "hyperlink.png";
    public static String ICON_HEADER = "header.png";
    // CSS STYLE SHEET CLASSES
    public static String    CSS_CLASS_VERTICAL_TOOLBAR_BUTTON = "vertical_toolbar_button";
    public static String    CSS_CLASS_HORIZONTAL_TOOLBAR_BUTTON = "horizontal_toolbar_button";
    public static String    CSS_CLASS_PAGE_EDIT_VBOX = "page_edit_vbox";
    public static String    CSS_CLASS_PAGE_EDIT_VIEW = "page_edit_view";
    public static String    CSS_CLASS_PAGE_SELECTION = "page_selection";
    public static String    CSS_CLASS_BUTTONS        = "buttons";
    // UI LABELS
    public static String    LABEL_EPORTFOLIO_TITLE = "ePortfolio_title";
}
