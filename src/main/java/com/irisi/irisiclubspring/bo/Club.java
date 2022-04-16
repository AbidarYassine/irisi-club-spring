package com.irisi.irisiclubspring.bo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "clubs")
public class Club implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String logo;
    private String webSite;
}
