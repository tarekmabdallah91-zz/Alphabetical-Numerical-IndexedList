/*
 * Copyright 2018 tarekmabdallah91@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gmail.tarekmabdallah91.myindexedlist.IndexedListModel;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;

import com.gmail.tarekmabdallah91.myindexedlist.R;

import java.util.List;

import static com.gmail.tarekmabdallah91.myindexedlist.IndexedListModel.IndexedListPresenter.ZERO;

public class IndexedList {

    private String LIST_INDICATORS = "#,A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";
    private AppCompatActivity activity;
    private int resFrameLayout;
    private float stripTextSize = 18f;
    private float sectionTextSize = 18f;
    private float itemsTextSize = 14f;
    private float itemsSizeSideIndex = 10f;
    private int paddingLeft = ZERO;
    private int paddingRight = ZERO;
    private int paddingTop = ZERO;
    private int paddingBottom = ZERO;
    private int resColorItem = android.R.color.darker_gray;
    private int resColorSection = android.R.color.black;
    private int resColorStrip = android.R.color.black;
    private int resColorIdForUnDimmedItems = android.R.color.black;
    private int resColorIdForDimmedItems = android.R.color.darker_gray;
    private int resBackgroundColorIdStrip = android.R.color.transparent;
    private IndexedListFragment indexedListFragment;
    private List contacts;
    private IndexedListListener indexedListListener;
    private int resBackgroundColor = android.R.color.white;
    @SuppressLint("StaticFieldLeak")
    private static volatile IndexedList indexedList = null;

    private IndexedList(AppCompatActivity activity){
        this.activity = activity;
    }

    public static IndexedList getInstance(AppCompatActivity activity){
        if (null == indexedList){
            synchronized (IndexedList.class) {
                indexedList = new IndexedList(activity);
            }
        }
        return indexedList;
    }

    public void start(){
        setIndexedListFragment();
        activity.getSupportFragmentManager()
                .beginTransaction()
                .add(resFrameLayout,indexedListFragment)
                .commit();
    }

    List getContacts() {
        return contacts;
    }

    IndexedListListener getIndexedListListener() {
        return indexedListListener;
    }

    int getResBackgroundColor() {
        return resBackgroundColor;
    }

    AppCompatActivity getActivity() {
        return activity;
    }

    float getSectionTextSize() {
        return sectionTextSize;
    }

    float getItemsTextSize() {
        return itemsTextSize;
    }

    int getResColorItem() {
        return resColorItem;
    }

    int getResColorSection() {
        return resColorSection;
    }

    float getItemsSizeSideIndex() {
        return itemsSizeSideIndex;
    }

    int getResColorIdForUnDimmedItems() {
        return resColorIdForUnDimmedItems;
    }

    int getResColorIdForDimmedItems() {
        return resColorIdForDimmedItems;
    }

    int getPaddingLeft() {
        return paddingLeft;
    }

    int getPaddingRight() {
        return paddingRight;
    }

    int getPaddingTop() {
        return paddingTop;
    }

    int getPaddingBottom() {
        return paddingBottom;
    }

    float getStripTextSize() {
        return stripTextSize;
    }

    int getResBackgroundColorIdStrip() {
        return resBackgroundColorIdStrip;
    }

    int getResColorStrip() {
        return resColorStrip;
    }

    public String getLIST_INDICATORS() {
        return LIST_INDICATORS;
    }

    public IndexedList setDimmedColorInSideIndex(int resColorIdForDimmedItems){
        this.resColorIdForDimmedItems = resColorIdForDimmedItems;
        return this;
    }

    public IndexedList setResColorIdForUnDimmedItems(int resColorIdForUnDimmedItems) {
        this.resColorIdForUnDimmedItems = resColorIdForUnDimmedItems;
        return this;
    }

    public IndexedList setItemsSizeSideIndex(float itemsSizeSideIndex) {
        this.itemsSizeSideIndex = itemsSizeSideIndex;
        return this;
    }

    public IndexedList setItemsTextSize(float itemsTextSize) {
        this.itemsTextSize = itemsTextSize;
        return this;
    }

    public IndexedList setSectionTextSize(float sectionTextSize) {
        this.sectionTextSize = sectionTextSize;
        return this;
    }

    public IndexedList setResColorItem(int resColorItem) {
        this.resColorItem = resColorItem;
        return this;
    }

    public IndexedList setResColorSection(int resColorSection) {
        this.resColorSection = resColorSection;
        return this;
    }

    public IndexedList setResBackgroundColor(int resBackgroundColor) {
        this.resBackgroundColor = resBackgroundColor;
        return this;
    }

    private void setIndexedListFragment() {
        indexedListFragment = new IndexedListFragment();
        indexedListFragment.setIndexedList(this);
    }

    public IndexedList setListContacts(List contacts) {
        this.contacts = contacts;
        return this;
    }

    public IndexedList setResFrameLayout(int resFrameLayout) {
        this.resFrameLayout = resFrameLayout;
        return this;
    }

    public IndexedList setIndexedListListener(IndexedListListener indexedListListener) {
        this.indexedListListener = indexedListListener;
        return this;
    }

    public IndexedList setPadding(int paddingLeft, int paddingTop ,int paddingRight, int paddingBottom) {
        this.paddingLeft = paddingLeft;
        this.paddingTop = paddingTop;
        this.paddingRight = paddingRight;
        this.paddingBottom = paddingBottom;
        return this;
    }

    public IndexedList setStripTextSize(float stripTextSize) {
        this.stripTextSize = stripTextSize;
        return this;
    }

    public IndexedList setResColorIdForDimmedItems(int resColorIdForDimmedItems) {
        this.resColorIdForDimmedItems = resColorIdForDimmedItems;
        return this;
    }

    public IndexedList setResBackgroundColorIdStrip(int resBackgroundColorIdStrip) {
        this.resBackgroundColorIdStrip = resBackgroundColorIdStrip;
        return this;
    }

    public IndexedList setResColorStrip(int resColorStrip) {
        this.resColorStrip = resColorStrip;
        return this;
    }

    public IndexedList setListIndicators(String listIndicators) {
        LIST_INDICATORS = listIndicators;
        return this;
    }
}
