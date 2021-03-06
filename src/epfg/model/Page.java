/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epfg.model;

import epfg.Contents.HeaderComponent;
import epfg.Contents.ImageComponent;
import epfg.Contents.TextComponent;
import epfg.Contents.VideoComponent;
import epfg.controller.ImageSelectionController;
import epfg.controller.ListInputController;
import epfg.controller.ParagraphInputController;
import epfg.controller.VideoSelectionController;
import epfg.view.ePortfolioGeneratorView;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.ObservableList;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import ssm.model.SlideShowModel;
import ssm.view.SlideShowMakerView;

/**
 *
 * @author seunchoi
 */
public class Page {
    String pageTitle;
    boolean hasFooter,hasBanner;
    List<String> components;
    List<Integer> componentsIndex = new ArrayList();
    List<ImageComponent> images = new ArrayList();
    List<SlideShowModel> slides = new ArrayList();
    List<TextComponent> texts = new ArrayList();
    List<VideoComponent> videos = new ArrayList();
    List<HeaderComponent>headers = new ArrayList();
    List<ArrayList<String>> list = new ArrayList();
    Image BannerImage;
    
    String font, footer,layout,backgroundColor;
    String SelectedType;
    int SelectedPosition;
    
    //public Page(String newPageTitle)
    
    public Page(String initTitle, List<String> initcomponents) {
        pageTitle = initTitle;
        components = initcomponents;
        hasFooter = false;
        for(int i=0 ; i<initcomponents.size(); i++) {
            
            String nComponent = initcomponents.get(i);
            if(!nComponent.equals("footer")) {
                

            }

            if(nComponent.equals("footer")){
                
            }


            if(nComponent.equals("image")) {

            } 
            else if(nComponent.equals("video")){

            }
            else if(nComponent.equals("slideshow")){

            }
            else if(nComponent.equals("header")){

            }
            else if(nComponent.equals("text")){

            }
            else if(nComponent.equals("list")){

            }
            else if(nComponent.equals("banner")){

            }
       }
 

    }
    
    public Page(String initTitle) {
        pageTitle = initTitle;
        components = new ArrayList<> ();
        hasFooter = false;
        hasBanner = false;
        layout = "1";
        backgroundColor = "default";
        font = "default";
    }
    
    public String getTitle() {
        return pageTitle;
    }
    public List<String> getComponents() {
        return components;
    }
    public List<ImageComponent> getImageComponents(){
        return images;
    }
    public List<VideoComponent> getVideoComponents() {
        return videos;
    }
    public List<SlideShowModel> getSlideShowComponents() {
        return slides;
    }
    public List<TextComponent> getTextComponents() {
        return texts;
    }
    public List<SlideShowModel> getSlideComponents() {
        return slides;
    }
    public List<HeaderComponent> getHeaderCOmponents() {
        return headers;
    }
    
    
    
    //public Slide(String initPageTitle, String[] init)

    public void setTitle(String ntitle) {
        pageTitle = ntitle;
    }
    public void setSelectedComponent(String selection,int i) {
        SelectedType = selection;
        SelectedPosition = i;
    }
    
    

    public void AddImage(String imagePath, String imageFileName, String caption, double height, double width, String position) {
        ImageComponent imgComp = new ImageComponent(imagePath, imageFileName, caption,  height, width, position);
        components.add("image");
        int index = images.size();
        componentsIndex.add(index);
        images.add(imgComp);
    }
    
    public void AddVideo(String videoPath, String videoFileName,String caption, double height, double width) {
        VideoComponent vidComp = new VideoComponent(videoPath, videoFileName,caption,  height, width);
        components.add("video");
        int index = videos.size();
        componentsIndex.add(index);
        videos.add(vidComp);
    }
    
    public void AddParagraph(String inputP, String inputF) {
        TextComponent paraComp = new TextComponent(inputF, inputP);
        components.add("paragraph");
        int index = texts.size();
        componentsIndex.add(index);
        texts.add(paraComp);        
    }
    public void AddSlideShow(SlideShowModel slideshow) {
        components.add("slideshow");
        int index = slides.size();
        componentsIndex.add(index);
        slides.add(slideshow);    
    }
    public void AddHeader(String inputH, String inputF, String inputP) {
        HeaderComponent headerComp = new HeaderComponent(inputH,inputF, inputP);
        components.add("header");
        int index = headers.size();
        componentsIndex.add(index);
        headers.add(headerComp);         
    }
    public void AddList(ArrayList<String> initList){
        components.add("list");
        int index =list.size();
        componentsIndex.add(index);
        list.add(initList);
        
    }
    
    public void EditComponent(int index,ePortfolioGeneratorView ui){
        String s = components.get(index);
        int r = componentsIndex.get(index);        
        if(s.equals("paragraph")){
            ParagraphInputController a = new ParagraphInputController();
            a.EditParagraph(this, texts.get(r) , index ,ui);
        }
        if(s.equals("list")) {
            ListInputController a = new ListInputController();
            a.ModifyList(this ,list.get(r),index,ui);
        }
        if(s.equals("video")) {
            VideoSelectionController a = new VideoSelectionController();
            a.EditVideo(this,videos.get(r),index,ui);
        }
        if(s.equals("image")){
            ImageSelectionController a = new ImageSelectionController();
            a.EditImage(this,images.get(r),index,ui);
        }
        if(s.equals("slideshow")){
                SlideShowMakerView view = new SlideShowMakerView(this,slides.get(r),index, ui);
                Stage SlideStage = new Stage();
                view.startUI(SlideStage,"Make SlideShow");
        }
        

    }
    
    public void EditParagraph(String inputP, String inputF,int index) {
        TextComponent paraComp = new TextComponent(inputF, inputP);
        int compIndex = componentsIndex.get(index);
        texts.set(compIndex, paraComp);        
    }
    public void EditList(ArrayList<String> inputList, int index) {
        int compIndex = componentsIndex.get(index);
        list.set(compIndex, inputList);
    }
    public void EditImage(String imagePath, String imageFileName, String caption, double height, double width, String position,int index){
        ImageComponent imgComp = new ImageComponent(imagePath, imageFileName, caption,  height, width, position);
        int compIndex = componentsIndex.get(index);
        images.set(compIndex, imgComp);
    }
    
    public void EditVideo(String videoPath, String videoFileName,String caption, double height, double width,int index) {
        VideoComponent vidComp = new VideoComponent(videoPath, videoFileName,caption,  height, width);
        int compIndex = componentsIndex.get(index);
        videos.set(compIndex,vidComp);
    }
    public void EditSlideShow(SlideShowModel load, int index){
        int compIndex = componentsIndex.get(index);
        slides.set(compIndex,load);
    }
    
    
public void RemoveComponent(int index) {
   
    String removeType = components.get(index);
    int position =0;
    for(int i=0; i<index; i++) {
        if(components.get(i).equals(removeType)) {
            position++;
        }
    }
    components.remove(index);
    componentsIndex.remove(index);
    if (removeType.equals("image")) {
        images.remove(position);
        for (int i=index; i<components.size(); i++) {
            if(components.get(i).equals("image")){
                int t = componentsIndex.get(i);
                componentsIndex.set(t, t-1);
            }                
        }
    }
        
        /**
        images.remove(relativeIndex);
        ArrayList<Integer> temp = new ArrayList();
        for(int i = 0 ; i < components.size() ; i++) {
            String s = components.get(i);
            
            if (s.equals("image")) {
                temp.add(i);            
            }
        }
        for (int i=0; i< temp.size(); i++){
            int ind = temp.get(i);
            if(componentsIndex.get(ind) > relativeIndex) {
                int t = componentsIndex.get(ind);
                componentsIndex.set(ind, t-1);
            }
        }
        * **/
    
    if (removeType.equals("video")) {
        videos.remove(position);
        for (int i=index; i<components.size(); i++) {
            if(components.get(i).equals("video")){
                int t = componentsIndex.get(i);
                componentsIndex.set(t, t-1);
            }                
        }
    }
    if (removeType.equals("slideshow")) {
        slides.remove(position);
        for (int i=index; i<components.size(); i++) {
            if(components.get(i).equals("slideshow")){
                int t = componentsIndex.get(i);
                componentsIndex.set(t, t-1);
            }                
        }
    } 
    if (removeType.equals("paragraph")) {
        texts.remove(position);
        for (int i=index; i<components.size(); i++) {
            if(components.get(i).equals("paragraph")){
                int t = componentsIndex.get(i);
                componentsIndex.set(t, t-1);
            }                
        }
    }

    if (removeType.equals("header")) {
        headers.remove(position);
        for (int i=index; i<components.size(); i++) {
            if(components.get(i).equals("header")){
                int t = componentsIndex.get(i);
                componentsIndex.set(t, t-1);
            }                
        }
    }
    if(removeType.equals("list")) {
        list.remove(position);
        for (int i=index; i<components.size(); i++) {
            if(components.get(i).equals("list")){
                int t = componentsIndex.get(i);
                componentsIndex.set(t, t-1);
            }                
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    public void setLayout(String customLayout) {
        layout = customLayout;
    }

    public void setFont(String inputFont) {
            font = inputFont;
    }

    public void setBackgroundColor(String inputColor) {
        backgroundColor = inputColor;
    }

    public void setFooter(String inputfooter) {
        footer = inputfooter;
        hasFooter = true;
    }

    public String getFooter() {
        return footer;
    }
    public String getLayout() {
        return layout;
    }
    public String getFont() {
        return font;
    }
    public String getSelectedType() {
        return SelectedType;
    }
    
    public int getSelectedPosition() {
        return SelectedPosition;
    }

    public void setBannerImage(String path, String name) {
        String imagePath = "file:" + path + name;
        BannerImage = new Image(imagePath);
        hasBanner = true;
    }
    
    public Image getBannerImage() {
        return BannerImage;
    }
    
    public boolean hasFooter() {
        return hasFooter;
    }
    public boolean hasBanner() {
        return hasBanner;
    }
    public List<ArrayList<String>> getLists() {
        return list;
    }

    
}
