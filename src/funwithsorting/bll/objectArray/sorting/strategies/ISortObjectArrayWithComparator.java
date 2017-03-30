/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funwithsorting.bll.objectArray.sorting.strategies;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author gta1
 */
public interface ISortObjectArrayWithComparator {

    public <T> void sort(List<T> data, Comparator<? super T> comparator);

}
