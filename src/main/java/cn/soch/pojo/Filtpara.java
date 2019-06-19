package cn.soch.pojo;

import org.apache.ibatis.javassist.compiler.ast.Keyword;

public class Filtpara {
    private String keyWord;
    private boolean onlyOwnLib;

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public boolean isOnlyOwnLib() {
        return onlyOwnLib;
    }

    public void setOnlyOwnLib(boolean onlyOwnLib) {
        this.onlyOwnLib = onlyOwnLib;
    }

    @Override
    public String toString() {
        return "Filtpara{" +
                "keyWord='" + keyWord + '\'' +
                ", onlyOwnLib=" + onlyOwnLib +
                '}';
    }
}
