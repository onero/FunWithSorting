/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting.bll.ObjectArray.sorting;

import java.util.List;

/**
 *
 * @author gta1
 * @param <T>
 */
public interface ISortObjectArrayStrategy<T> {

    public void sort(List<T> data);

}
