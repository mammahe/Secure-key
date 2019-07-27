<div class="application-main " data-commit-hovercards-enabled="">
<div class=""><main id="js-repo-pjax-container" data-pjax-container="">
<div class="container-lg clearfix new-discussion-timeline experiment-repo-nav  px-3">
<div class="repository-content ">
<div id="readme" class="Box Box--condensed instapaper_body md js-code-block-container">
<div class="Box-body">
<article class="markdown-body entry-content p-5">
<p>Goal is to have storing Credentials Securely on Android Devices</p>
<h2><a id="user-content-requirements" class="anchor" href="https://github.com/mammahe/Format-Number-Libphonenumber#requirements" aria-hidden="true"></a><strong>Requirements</strong></h2>
<p>Android 4.0 or higher&nbsp;</p>
<h2><a id="user-content--usage" class="anchor" href="https://github.com/mammahe/Format-Number-Libphonenumber#-usage" aria-hidden="true"></a><strong>Usage</strong></h2>
<h4><a id="user-content-step-1add-it-in-your-root-buildgradle-at-the-end-of-repositories" class="anchor" href="https://github.com/mammahe/Format-Number-Libphonenumber#step-1add-it-in-your-root-buildgradle-at-the-end-of-repositories" aria-hidden="true"></a><strong>Step 1.&nbsp;</strong>Add it in your root build.gradle at the end of repositories:</h4>
<pre class="kode language-css code-toolbar"><code class=" kode language-css"><span class="token selector">allprojects</span> <span class="token punctuation">{</span>
		<span class="token selector">repositories</span> <span class="token punctuation">{</span>
			<span class="token selector">...
			maven</span> <span class="token punctuation">{</span> url <span class="token string">'https://jitpack.io'</span> <span class="token punctuation">}</span>
		<span class="token punctuation">}</span>
	<span class="token punctuation">}</span></code></pre>
<p><strong>Step 2.&nbsp;Add the dependency</strong></p>
<pre class="kode code-toolbar  language-css"><code id="depCodeGradle" class=" kode  language-css"><span class="token selector">dependencies</span> <span class="token punctuation">{</span>
	        implementation <span class="token string">'com.github.mammahe:Secure-key:Tag'</span>
	<span class="token punctuation">}</span></code></pre>
<p><strong>Step 3. Add import in activity</strong></p>
<pre><span class="pl-k">import</span> <span class="pl-smi">com.sairamkrishna.keystoresecure.Secure</span>;</pre>
<p><strong>Step 4. Add TOKEN_KEY as shown below&nbsp;</strong></p>
<pre><span class="pl-smi">Secure</span><span class="pl-c1"><span class="pl-k">.</span>TOKEN_KEY</span> <span class="pl-k">=</span><span class="pl-s"><span class="pl-pds">"</span>fqJfdzGDvfwbedsKSUGty3VZ9taXxMVw<span class="pl-pds">"</span></span>;</pre>
<p><strong>Step 5. To Encrypt string key use the following code&nbsp;</strong></p>
<pre><span class="pl-smi">Secure</span><span class="pl-k">.</span>encrypt(name))</pre>
<p><strong>Step 6. To Decrypt string key use the following code&nbsp;</strong></p>
<pre><span class="pl-smi">Secure</span><span class="pl-k">.</span>decrypt(name))</pre>
<h2><a id="user-content-output" class="anchor" href="https://github.com/mammahe/Format-Number-Libphonenumber#output" aria-hidden="true"></a>Output</h2>
<p><a href="https://user-images.githubusercontent.com/39652440/61815603-3f19d480-ae68-11e9-8360-4e2aeb276823.png" target="_blank" rel="noopener noreferrer"><img src="https://github.com/mammahe/Secure-key/blob/master/Screenshot_20190727-222402.png" alt="" width="350" height="700" /></a></p>
<h2><a id="user-content-license" class="anchor" href="https://github.com/mammahe/Format-Number-Libphonenumber#license" aria-hidden="true"></a>License</h2>
<p>Copyright 2019 Sairamkrishna Mammahe</p>
<p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at</p>
<p><a href="http://www.apache.org/licenses/LICENSE-2.0" rel="nofollow">http://www.apache.org/licenses/LICENSE-2.0</a></p>
<p>Unless required by applicable law or agreed to in writing, software under the License is distributed on an "AS IS" BASIS, WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. the License for the specific language governing permissions and under the License.</p>
</article>
</div>
</div>
</div>
</div>
</main></div>
</div>
<div class="footer container-lg width-full px-3" role="contentinfo">
<div class="position-relative d-flex flex-justify-between pt-6 pb-2 mt-6 f6 text-gray border-top border-gray-light ">&nbsp;</div>
</div>
