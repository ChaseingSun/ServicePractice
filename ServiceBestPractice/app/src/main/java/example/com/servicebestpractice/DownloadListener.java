package example.com.servicebestpractice;

/**
 * @author Likang
 * @version 1.0
 * @date 2018/8/23 0023
 */
public interface DownloadListener {

    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPaused();

    void onCanceled();
}
