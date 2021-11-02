/*InClass 08
        Grouping3 - 18
        Name: Rahul Govindkumar
        Name: Amruth Nag
        */


package com.example.HW05_forumfirebase;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class POJOclasses {

    public static class Forum {
        String userName;
        String title;
        String content;
        String time;
        String Uid;
        String docId;
        Set<String> likes;

        public Forum(String[] contents, Set<String> likes) {
            this.userName = contents[0];
            this.title = contents[1];
            this.content = contents[2];
            this.time = contents[3];
            this.Uid = contents[4];
            try {
                this.docId = contents[5];
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                this.likes = likes;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public String getUid() {
            return Uid;
        }

        public void setUid(String uid) {
            Uid = uid;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public HashMap<Object, Object> toHashmap() {
            HashMap<Object, Object> dataMap = new HashMap<>();
            dataMap.put("userName", this.userName);
            dataMap.put("title", this.title);
            dataMap.put("content", this.content);
            dataMap.put("time", this.time);
            dataMap.put("Uid", this.Uid);
            dataMap.put("likes", Arrays.asList(likes));
            return dataMap;
        }

        public String getDocId() {
            return docId;
        }

        public void setDocId(String docId) {
            this.docId = docId;
        }

        public Set<String> getLikes() {
            return likes == null ? likes : new Set<String>() {
                @Override
                public int size() {
                    return 0;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public boolean contains(@Nullable Object o) {
                    return false;
                }

                @NonNull
                @Override
                public Iterator<String> iterator() {
                    return null;
                }

                @NonNull
                @Override
                public Object[] toArray() {
                    return new Object[0];
                }

                @NonNull
                @Override
                public <T> T[] toArray(@NonNull T[] ts) {
                    return null;
                }

                @Override
                public boolean add(String s) {
                    return false;
                }

                @Override
                public boolean remove(@Nullable Object o) {
                    return false;
                }

                @Override
                public boolean containsAll(@NonNull Collection<?> collection) {
                    return false;
                }

                @Override
                public boolean addAll(@NonNull Collection<? extends String> collection) {
                    return false;
                }

                @Override
                public boolean retainAll(@NonNull Collection<?> collection) {
                    return false;
                }

                @Override
                public boolean removeAll(@NonNull Collection<?> collection) {
                    return false;
                }

                @Override
                public void clear() {

                }
            };
        }

        public void setLikes(Set<String> likes) {
            this.likes = likes;
        }
    }
}
