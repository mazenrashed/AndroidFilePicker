package me.rosuh.sample

import me.rosuh.filepicker.filetype.AudioFileType

/**
 * Created by rosu on 2019-07-17.
 * 这是一个自定义的音频文件类，帮你扩展默认的音频文件类
 * This is a custom audio file class to help you extend the default audio file class
 */
class EnhanceAudioType: AudioFileType() {
    private val customFileSuffix = "flac"

    override fun verify(fileName: String): Boolean {
        val superResult = super.verify(fileName)
        return superResult || fileName.endsWith(customFileSuffix)
    }
}