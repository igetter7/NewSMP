/*
 * NewSMPShopManagementPlatformLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package localhost.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class Rating 
        implements java.io.Serializable {
    private static final long serialVersionUID = 7137444816055142069L;
    private String point;
    private String star;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("point")
    public String getPoint ( ) { 
        return this.point;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("point")
    public void setPoint (String value) { 
        this.point = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("star")
    public String getStar ( ) { 
        return this.star;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("star")
    public void setStar (String value) { 
        this.star = value;
    }
 
}
