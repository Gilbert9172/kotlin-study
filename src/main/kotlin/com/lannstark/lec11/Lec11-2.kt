package com.lannstark.lec11

/**
 * 파일 최상단에 유틸 함수를 작성하면 편리하다.
 */
fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}
