
package structural.bridge;

import java.util.List;

public class HTMLFormatter implements  Formatter{

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("<table>");
        builder.append("<tr><th>");
        builder.append("Classification");
        builder.append("</th><th>");
        builder.append(header);
        builder.append("</th></tr>");
        
        for (Detail detail : details){
            builder.append("<tr><td>");
            builder.append(detail.getLabel());            
            builder.append("</td><td>");
            builder.append(detail.getValue());
            builder.append("</td></tr>");
        }
        builder.append("</table>");
        return builder.toString();
    }
    
}
