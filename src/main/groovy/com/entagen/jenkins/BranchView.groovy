package com.entagen.jenkins

class BranchView {
    String templateJobPrefix
    String branchName

    public String getViewName() {
        return "$templateJobPrefix-${getUserName()}"
    }

    public String getSafeBranchName() {
        return branchName.replaceAll('/', '_')
    }

    public String getUserName() {
        String[] parts = getSafeBranchName().split('_');

        if (parts.length > 1) {
            return parts[1];
        }
        else {
            return "no-owner";
        }
    }

    public String toString() {
        return this.viewName
    }
}
