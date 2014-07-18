package com.kubeiwu.dowmloadtool.providers;

import android.app.Activity;
import android.os.Bundle;

import com.kubeiwu.downloadprovider.R;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	/**
	 * 下载demo
	 */
	//	public static long downLoadApk(Context mContext, DownloadManager manager, WebAppInfo webAppInfo) {
	//
	//		try {
	//			String url = webAppInfo.getApkurl();
	//			Uri srcUri = Uri.parse(url);
	//			DownloadManager.Request request = new Request(srcUri);
	//
	//			// 设置文件保存的路径
	//			//request.setDestinationInExternalDir(getApplicationContext(),
	//			//DOWNLOAD_DIR_NAME, ai.getName() + ".apk");
	//			//String file=Environment.getExternalStorageDirectory().getAbsolutePath();
	//			AppPara apppara = (AppPara) Util.xmlToObject(mContext, "apppara");
	//			File file = new File(Environment.getExternalStorageDirectory(), apppara != null ? apppara.getCatalog() : "konka/market");
	//			//						File file = new File(Environment.getExternalStorageDirectory(), "konka/market");
	//			if (!file.exists()) {
	//				file.mkdirs();
	//			}
	//			request.setDestinationInExternalFilesDir(mContext, apppara != null ? apppara.getCatalog() : "konka/market",
	//					MD5.getMD5String(webAppInfo.getTitle()) + ".apk");
	//			request.setDescription("下载");//allowednetworktypes
	//			//			request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE);
	//			request.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE | DownloadManager.Request.NETWORK_WIFI);
	//			request.setShowRunningNotification(false);
	//			request.setId(webAppInfo.getId());
	//			request.setIconurl(webAppInfo.getIconurl());
	//			//			System.out.println("下载的地址是="+webAppInfo.getIconurl());
	//			request.setVersionName(webAppInfo.getVersion());
	//			request.setTitle(webAppInfo.getTitle());
	//			return manager.enqueue(request);
	//
	//		} catch (Exception e) {
	//			e.printStackTrace();
	//		}
	//		return -1;
	//	}
	/**
	 * 下载demo
	 */
	//		public static long downLoadApk(Context mContext, DownloadManager manager, String downloadurl) {
	//			DownloadManager.Request down = new DownloadManager.Request(Uri.parse(downloadurl));
	//	//		DownLoadProvider d;
	//			// 设置允许使用的网络类型，这里是移动网络和wifi都可以
	////			down.setAllowedNetworkTypes(0);
	//			down.setAllowedNetworkTypes(DownloadManager.Request.NETWORK_MOBILE | DownloadManager.Request.NETWORK_WIFI);
	//	//		DownloadManager.Request.
	//			// 禁止发出通知，既后台下载
	//			//down.setShowRunningNotification(true);
	//			// down.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE);
	//			// 不显示下载界面
	//			down.setVisibleInDownloadsUi(true);
	//			// 设置下载后文件存放的位置
	//			// down.setDestinationInExternalFilesDir(mContext, null,"vpic.apk");
	//			// 设置下载路径 /mnt/sosspad/download
	//			//Environment.getExternalStoragePublicDirectory(type);
	//			down.setDestinationInExternalPublicDir("/download/", mContext.getString(R.string.app_name) + ".apk");
	//			// 将下载请求放入队列
	//			if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {// sdk17
	//				down.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
	//			}
	//			// 表示下载进行中和下载完成的通知栏是否显示。默认只显示下载中通知。
	//			return manager.enqueue(down);
	//		}
	//	public static Long downLoadApk(Context mContext, DownloadManager manager, String downloadurl) {
	//		String url = downloadurl;
	//		Uri srcUri = Uri.parse(url);
	//		DownloadManager.Request request = new Request(srcUri);
	//		request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "/");
	////		request.setDestinationInExternalFilesDir(mContext.getApplicationContext(), "test_download", "");
	//		request.setDescription("Just for test");
	//		Long id = manager.enqueue(request);
	//		return id;
	//	}

	//	public static long downLoadApk(Context mContext, DownloadManager manager, String downloadurl) {
	//		String url = downloadurl;
	//		Uri srcUri = Uri.parse(url);
	//		DownloadManager.Request request = new Request(srcUri);
	//		request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "/");
	//		request.setDescription("Just for test");
	//		Long id = manager.enqueue(request);
	//		return id;
	//	}
}
