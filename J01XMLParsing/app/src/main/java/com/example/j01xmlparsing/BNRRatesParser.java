package com.example.j01xmlparsing;

import android.os.AsyncTask;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class BNRRatesParser
        extends AsyncTask<String, Void, List<RataSchimb>> {
    @Override
    protected List<RataSchimb> doInBackground(String... strings) {
        try {
            List<RataSchimb> lista=new ArrayList<>();
            URL url=new URL(strings[0]);
            HttpURLConnection http=(HttpURLConnection)url.openConnection();

            InputStream inputStream=http.getInputStream();

            DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=factory.newDocumentBuilder();
            Document document=builder.parse(inputStream);

            if(document!=null){
                NodeList rates=document.getElementsByTagName("Rate");
                for(int i=0;i<rates.getLength();i++){
                    Node node=rates.item(i);
                    if(node!=null && node.getNodeType()==Node.ELEMENT_NODE){
                        Element element=(Element)node;
                        RataSchimb rate=new RataSchimb(
                                element.getAttribute("currency"),
                                Double.parseDouble(element.getTextContent())
                        );
                        lista.add(rate);
                    }
                }
                return lista;
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }


        return null;
    }
}